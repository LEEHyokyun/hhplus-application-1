package kr.hhplus.be.server.point.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hhplus.be.server.fake.FakeModel;

@RestController
@RequestMapping("/point")
public class PointController {
	
	@PostMapping("/charge")
	  FakeModel charge(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
	@PostMapping("/pay")
	  FakeModel pay(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
	@GetMapping("/search")
	FakeModel search(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
}
