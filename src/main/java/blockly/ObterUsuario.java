package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ObterUsuario {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Dados
	 * @return Var
	 */
	// Obter usuario
	public static Var Executar(Var Dados) throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				return cronapi.database.Operations.query(Var.valueOf("app.entity.User"),
						Var.valueOf("select u.name from User u"));
			}
		}.call();
	}

}
