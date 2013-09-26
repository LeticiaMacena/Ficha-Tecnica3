package br.com.view;

import br.com.model.negocio.Funcionario;
import br.com.model.negocio.Colecao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Rosicléia Frasson
 */
public class ColecaoTableModel extends AbstractTableModel {

    private static final int COL_ID = 0;
    private static final int COL_TEMA = 1;
    private static final int COL_ESTACAO = 2;
    private static final int COL_FUNCIONARIORESPONSAVEL = 3;    
    


    

    private List<Colecao> linhas;
    // Array com os nomes das colunas.
    private String[] colunas = new String[]{"Código", "Tema","Estação","Funcionario Responsavel",
   };

    //Cria uma ColecaoTableModel sem nenhuma linha
    public ColecaoTableModel() {
        linhas = new ArrayList<Colecao>();
    }

    //Cria uma ColecaoTableModel contendo a lista recebida por parâmetro.
    public ColecaoTableModel(List<Colecao> colecoes) {
        this.linhas = new ArrayList<Colecao>(colecoes);
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
        } else if (columnIndex == COL_TEMA) {
            return Integer.class;
        }
                if (columnIndex == COL_ESTACAO) {
            return Integer.class;

      
        } else if (columnIndex == COL_FUNCIONARIORESPONSAVEL) {
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
         Colecao m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getId();
        } else if (column == COL_TEMA) {
            return m.getTema();
        } else if (column == COL_ESTACAO) {
            return m.getEstacao();
  
        } else if (column == COL_FUNCIONARIORESPONSAVEL) {
            return m.getFuncionarioReponsavel();
    
        }
        return "";
    }

    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Colecao u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_TEMA) {
            u.setTema((String) aValue);
             } else if (column == COL_ESTACAO) {
            u.setEstacao((String) aValue);
             } else if (column == COL_FUNCIONARIORESPONSAVEL) {
            u.setFuncionarioReponsavel((Funcionario) aValue);
   

        }
    }

    // Retorna a marca referente a linha especificada
    public Colecao getColecao(int indiceLinha) {
        return linhas.get(indiceLinha);
    }

// Adiciona a marca especificada ao automovel
    public void addColecao(Colecao colecao) {
        // Adiciona o registro.
        linhas.add(colecao);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarTema();

    }

    public void updateColecao(int indiceLinha, Colecao colecao) {
        linhas.set(indiceLinha, colecao);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarTema();
    }

    //Remove o sócio da linha especificada.
    public void removeColecao(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        ordenarTema();
    }

// Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }

    public void ordenarTema() {
        //ordena pelo nome
        Collections.sort(linhas, new Comparator<Colecao>() {
            public int compare(Colecao o1,Colecao o2) {
                return o1.getTema().compareTo(o2.getTema());
                
                
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
}
