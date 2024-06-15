package com.ffutagawa.workshopmongodb.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ffutagawa.workshopmongodb.domain.Post;
import com.ffutagawa.workshopmongodb.domain.User;
import com.ffutagawa.workshopmongodb.dto.UserDTO;
import com.ffutagawa.workshopmongodb.services.PostService;
import com.ffutagawa.workshopmongodb.services.UserService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private PostService service;

	@RequestMapping(value = "/{id}")
	@GetMapping
	public ResponseEntity<Post> findByPostId(@PathVariable String id) {
		Post obj = service.findByPostId(id);
		return ResponseEntity.ok().body(obj); 
	}
	
}
