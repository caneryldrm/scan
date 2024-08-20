package com.migscan.migscan;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.migscan.migscan.tables.kategori;
import com.migscan.migscan.service.kategoriService;
import com.migscan.migscan.repo.kategoriRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Optional;

@SpringBootTest
class MigscanApplicationTests {

	@Mock
	private kategoriRepo kategoriRepository;

	@InjectMocks
	private kategoriService kategoriService;




}


