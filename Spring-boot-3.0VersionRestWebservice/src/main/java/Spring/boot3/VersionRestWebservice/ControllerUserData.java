package Spring.boot3.VersionRestWebservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class ControllerUserData {
	
	@Autowired
	userdataRepository usdRepo;
	
		
	@GetMapping("/api/getAllData")
	public ResponseEntity<List<userdata>> gettingUsertData() {
		return new ResponseEntity<>(usdRepo.findAll(), HttpStatus.OK);
	}
	
	
	
	@GetMapping("/api/getUserById/{username}")
	public ResponseEntity<userdata> getUserByID(@PathVariable String username){
		Optional<userdata> userById = usdRepo.findById(username);
		
		if(userById.isPresent()) {
			return new ResponseEntity<>(userById.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	@PostMapping("/api/savingUserData")
	public ResponseEntity<userdata> savingUserData(@RequestBody userdata user){
		return new ResponseEntity<>(usdRepo.save(user),HttpStatus.CREATED);
	}
	
	
	
	@PutMapping("/api/modifyData/{name}")
	public ResponseEntity<userdata> modifyData(@PathVariable String name, @RequestBody userdata user){
		
		Optional<userdata> userId = usdRepo.findById(name);
		
		if(userId.isPresent()) {
			userId.get().setUserName(user.getUserName());
			userId.get().setEmail(user.getEmail());
			userId.get().setPassword(user.getPassword());
			userId.get().setPhoneNumber(user.getPhoneNumber());
			
			return new ResponseEntity<>(usdRepo.save(userId.get()),HttpStatus.OK);
			
		}else {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
