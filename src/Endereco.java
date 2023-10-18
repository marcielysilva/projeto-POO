import java.util.Date;

public class Endereco {
        private String rua;
        private String cidade;
        private String estado;
    
        public Endereco(String rua, String cidade, String estado) {
            this.rua = rua;
            this.cidade = cidade;
            this.estado = estado;
        }
    
        public String getRuaS() {
            return rua;
        }
    
        public void setRua(String rua) {
            this.rua = rua;
        }
        
        public String getCidade() {
            return cidade;
        }
    
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
    }

