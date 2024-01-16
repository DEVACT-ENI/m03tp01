package fr.eni.rcda32p.m03tp01.controller;


import fr.eni.rcda32p.m03tp01.bll.TreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
public class TreasureRoomController {
	private TreasureService tresorService;

	public String fin() {
		return tresorService.ouvrir();
	}

	@Autowired
	public void setTresorService(TreasureService tresorService) {
		this.tresorService = tresorService;
	}
}
