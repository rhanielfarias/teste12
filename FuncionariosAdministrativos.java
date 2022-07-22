
        public class FuncionariosAdministrativos extends Funcionario{

            private String funcaoAdministrativa;
          private String senioridade;

            public FuncionariosAdministrativos(String nome, String cpf, int nr, int ol, double salario, double reembolso, String funcaoAdministrativa, String senioridade) {
                super(nome, cpf, nr, ol, salario, reembolso);
                this.funcaoAdministrativa = funcaoAdministrativa;
                this.senioridade = senioridade;
            }

            public String getSenioridade() {
                return senioridade;
            }

            public void setSenioridade(String senioridade) {
                this.senioridade = senioridade;
            }

            public String getFuncaoAdministrativa() {
                return funcaoAdministrativa;
            }

            public void setFuncaoAdministrativa(String funcaoAdministrativa) {
                this.funcaoAdministrativa = funcaoAdministrativa;
            }



        }
