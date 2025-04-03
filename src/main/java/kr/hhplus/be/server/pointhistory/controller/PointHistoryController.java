package kr.hhplus.be.server.pointhistory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hhplus.be.server.fake.FakeModel;

@RestController
@RequestMapping("/pointhistory")
public class PointHistoryController {
	
	@PostMapping("/insert")
	  FakeModel history(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
}
