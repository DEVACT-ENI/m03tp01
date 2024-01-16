package fr.eni.rcda32p.m03tp01.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("passage")
public class EscapeRoom1Controller {

	public void entreeSalle1() {
		System.out.println("Bravo, vous avez trouvé la première salle !");
	}
	
}
