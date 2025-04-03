package kr.hhplus.be.server.productsales.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hhplus.be.server.fake.FakeModel;

@RestController
@RequestMapping("/productsales")
public class ProductSalesController {
	
	@GetMapping("/select")
	  FakeModel select(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
	@GetMapping("/selecthot")
	  FakeModel pay(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
	@PostMapping("/order")
	FakeModel order(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
	@PostMapping("/coupon")
	FakeModel coupon(@RequestBody FakeModel fakeModel) {
	    return new FakeModel();
	  }
	
}
