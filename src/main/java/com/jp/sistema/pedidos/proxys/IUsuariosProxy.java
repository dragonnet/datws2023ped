package com.jp.sistema.pedidos.proxys;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.jp.sistema.pedidos.model.entity.usuarios.Usuarios;

public interface IUsuariosProxy {
	ResponseEntity<Usuarios> getUsuarios() throws IOException;
}
