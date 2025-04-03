package kr.hhplus.be.server.producthistory.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hhplus.be.server.fake.FakeModel;

@RestController
@RequestMapping("/producthistory")
public class ProductHistoryController {

	@PostMapping("/insert")
	  FakeModel history(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
}
