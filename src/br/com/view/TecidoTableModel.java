package br.com.view;

import br.com.model.negocio.Funcionario;
import br.com.model.negocio.Tecido;
import br.com.model.negocio.Fornecedor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rosicléia Frasson
 */
public class TecidoTableModel extends AbstractTableModel {

    
    
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
      private static final int COL_FORNECEDOR = 2;
    private static final int COL_COR = 3;
    private static final int COL_DESCRICAO = 4;
    private static final int COL_TAMANHO = 7;

    private List<Tecido> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "nome","Fornecedor","Cor","descrição","Tamanho"};

    //Cria uma TecidoTableModel sem nenhuma linha
    public TecidoTableModel() {
        linhas = new ArrayList<Tecido>();
    }

    //Cria uma TecidoTableModel contendo a lista recebida por parâmetro.
    public TecidoTableModel(List<Tecido> tecidos) {
        this.linhas = new ArrayList<Tecido>(tecidos);
    }

    public int getRowCount() {
        return linhas.size();
    }

    /*
     * Retorna a quantidade de colunas
     * 2 colunas: uma para id e a outra para nome.
     */
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    public Class getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? A coluna 1 é inteira, as outras string.  
        if (columnIndex == COL_ID) {
            return Integer.class;
        } else if (columnIndex == COL_NOME) {
            return Integer.class;
        }
        if (columnIndex == COL_FORNECEDOR) {
            return Integer.class;
        } else if (columnIndex == COL_COR) {
            return Integer.class;
        }
        if (columnIndex == COL_DESCRICAO) {
            return Integer.class;
        
        } else if (columnIndex == COL_TAMANHO) {
            return Integer.class;
        }

        return null;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }

    //Retorna o valor da coluna e o valor da linha
    public Object getValueAt(int row, int column) {
        //pega a marca da linha
         Tecido m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getId();
        } else if (column == COL_NOME) {
            return m.getNome();
        } 
        if (column == COL_FORNECEDOR) {
            return m.getFornecedor();
        } else if (column == COL_COR) {
            return m.getCor();
        } 
        if (column == COL_DESCRICAO) {
            return m.getDescricao();
      
        } else if (column == COL_TAMANHO) {
            return m.getTamanho();
        } 
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Tecido u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome((String) aValue);
        } else if (column == COL_FORNECEDOR) {
            u.setFornecedor((Fornecedor) aValue);
        } else if (column == COL_COR) {
            u.setCor((String) aValue);
        } else if (column == COL_DESCRICAO) {
            u.setDescricao((String) aValue);
        } else if (column == COL_TAMANHO) {
            u.setTamanho((Double) aValue);


        }
        
    }

    // Retorna a marca referente a linha especificada
    public Tecido getTecido(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a marca especificada ao automovel
    public void addTecido(Tecido tecido) {
        // Adiciona o registro.
        linhas.add(tecido);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarNome();

    }

    public void updateTecido(int indiceLinha, Tecido tecido) {
        linhas.set(indiceLinha, tecido);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarNome();
    }

    //Remove o sócio da linha especificada.
    public void removeTecido(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        ordenarNome();
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }

    public void ordenarNome() {
        //ordena pelo nome
        Collections.sort(linhas, new Comparator<Tecido>() {
            public int compare(Tecido o1,Tecido o2) {
                return o1.getNome().compareTo(o2.getNome());
                
                
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }

    

}