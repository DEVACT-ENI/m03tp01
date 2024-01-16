package fr.eni.rcda32p.m03tp01.controller;


import fr.eni.rcda32p.m03tp01.bll.RoomService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("room2")
public class EscapeRoom2Controller {
	private RoomService roomService;

	public EscapeRoom2Controller(@Qualifier("room1Service") RoomService roomService) {
		this.roomService = roomService;
	}

	public void entreeSalle2() {
		System.out.println(roomService.entreeSalle());
	}

}
