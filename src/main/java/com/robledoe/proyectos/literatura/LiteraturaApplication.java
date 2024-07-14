package com.robledoe.proyectos.literatura;

import com.robledoe.proyectos.literatura.principal.Principal;
import com.robledoe.proyectos.literatura.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

    public LiteraturaApplication(MenuService menuService) {
        this.menuService = menuService;
    }

    public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Autowired
	private MenuService menuService;

	@Override
	public void run(String... args) {
		Principal principal = new Principal(menuService);
		principal.EjecutarAplicacion();
	}
}
