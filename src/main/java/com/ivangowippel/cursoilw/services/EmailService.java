package com.ivangowippel.cursoilw.services;

import org.springframework.mail.SimpleMailMessage;

import com.ivangowippel.cursoilw.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
}
