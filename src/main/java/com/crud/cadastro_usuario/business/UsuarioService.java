package com.crud.cadastro_usuario.business;

import org.springframework.stereotype.Service;
import com.crud.cadastro_usuario.infrastructure.entitys.Usuario;
import com.crud.cadastro_usuario.infrastructure.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
            () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deletarUsuarioPorEmail(String email) {
        repository.deleteByEmail(email);
    }
        
    public void atualizarUsuarioPorId(Long id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id).orElseThrow(
            () -> new RuntimeException("Usuário não encontrado")
        );
        Usuario usuarioAtualizado = Usuario.builder()
            .email(usuario.getEmail() != null ? 
                    usuario.getEmail() : usuarioEntity.getEmail())
            .nome(usuario.getNome() != null ? 
                    usuario.getNome() : usuarioEntity.getNome())
            .id(usuarioEntity.getId())
            .build();

        repository.saveAndFlush(usuarioAtualizado);
    }
}
