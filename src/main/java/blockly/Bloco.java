package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @param Dados
	 * @return Var
	 */
	// Bloco
	public static Var Executar(Var Dados) throws Exception {
		return new Callable<Var>() {

			private Var item = Var.VAR_NULL;

			public Var call() throws Exception {
				item = cronapi.database.Operations.query(Var.valueOf("app.entity.Teste"),
						Var.valueOf("select t from Teste t"));
				return cronapi.database.Operations.getField(item, Var.valueOf("this[0]"));
			}
		}.call();
	}

}
