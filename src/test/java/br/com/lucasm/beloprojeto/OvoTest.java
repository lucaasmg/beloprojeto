package br.com.lucasm.beloprojeto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OvoTest {
    
    @Test
	public void getStatusCruTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 499; i++) {
			ovo.fritar();
		}	
		assertEquals(EnumStatusOvo.CRU, ovo.getStatus());
	}
	
	@Test
	public void getStatusDeliciaTest() {		
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 999; i++) {
			ovo.fritar();
		}
		assertEquals(EnumStatusOvo.DELICIA, ovo.getStatus());
	}
	
	@Test
	public void getStatusQueimadoTest() {
		Ovo ovo = new Ovo(10);
		ovo.quebrar();
		for (int i = 0; i < 74; i++) {
			ovo.fritar();
		}	
		assertEquals(EnumStatusOvo.	CRU, ovo.getStatus());
	}

}
