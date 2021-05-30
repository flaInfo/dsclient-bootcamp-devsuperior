package com.devsuperior.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Daenerys Targaryen", "112345678901", 1000.0, Instant.parse("1980-04-09T10:13:38.00Z"), 2 ));
		list.add(new Client(2L, "Jon Snow", "123456789012", 23400.0, Instant.parse("1982-10-05T10:14:39.00Z"), 3 ));
		list.add(new Client(3L, "Arya Stark", "134567890123", 4500.0, Instant.parse("1984-11-06T10:15:30.00Z"), 4 ));
		list.add(new Client(4L, "Sansa Stark", "145678901234", 5700.0, Instant.parse("1985-12-07T10:16:31.00Z"), 5 ));
		return ResponseEntity.ok().body(list);
	}
	
}
