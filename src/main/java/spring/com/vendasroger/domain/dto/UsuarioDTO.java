package spring.com.vendasroger.domain.dto;


import lombok.Getter;
import lombok.Setter;
import spring.com.vendasroger.domain.entity.Usuario;
import spring.com.vendasroger.domain.resouce.BaseDTO;

@Getter
@Setter
public class UsuarioDTO implements BaseDTO<Usuario> {


	private String username;
	
	private String senha;
	
	private String roles;
	
	@Override
	public Usuario getEntity() {
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario.setSenha(senha);
		usuario.setRoles(roles);
		return usuario;
	}	
}
