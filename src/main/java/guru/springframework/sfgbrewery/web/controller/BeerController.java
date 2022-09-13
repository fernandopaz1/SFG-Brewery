package guru.springframework.sfgbrewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.sfgbrewery.web.model.BeerDTO;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId") UUID beerId){
		//TODO impl
		return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<BeerDTO>  saveNewBeer(@RequestBody BeerDTO beerDto){
		//TODO impl
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	
	@PutMapping("/{beerId}")
	public ResponseEntity<BeerDTO> upodateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDTO beerDto){
		//TODO impl
		return new ResponseEntity<>( HttpStatus.NO_CONTENT);
	}

	
}
