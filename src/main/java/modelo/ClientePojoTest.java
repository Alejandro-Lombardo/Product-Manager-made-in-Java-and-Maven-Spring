package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.CoreMatchers.*;

public class ClientePojoTest {
	ClientePojo cliente;
	ClientePojo clienteConValor;
	ClientePojo clienteBuilder;
	
	@BeforeEach
	private void setUp()
	{
		cliente = new ClientePojo();
		clienteConValor = new ClientePojo(1L, "Nombre", "Apellido", "pp@hotmail.com", "122456");
		clienteBuilder = new ClientePojoBuilder()
			.withId(2L)
			.withName("Nombre")
			.withLastName("Apellido")
			.withEmail("ee@ee.com")
			.withPassword("3333")
			.build();
	}
	@Test
	public void testClienteVacio()
	{
		System.out.println(cliente);
		assertThat(cliente, not(nullValue()));
		assertThat(cliente.getId(), isNullValue());
	}
	@Test
	public void testClienteConValor()
	{
		System.out.println(clienteConValor);
		assertThat(clienteConValor, not(nullValue()));
		assertThat(clienteConValor.getId(), not(nullValue()));
		assertThat(clienteConValor.getId(), equalTo(1L));
		assertThat(clienteConValor.getEmail(), equalTo("pp@hotmail.com"));
	}
	
	public void testClienteBuilder()
	{
		System.out.println(clienteBuilder);
		assertThat(clienteBuilder, not(nullValue()));
		assertThat(clienteBuilder.getId(), not(nullValue()));
		assertThat(clienteBuilder.getId(), equalTo(2L));
		assertThat(clienteBuilder.getEmail(), equalTo("ee@ee.com"));
	}
}

