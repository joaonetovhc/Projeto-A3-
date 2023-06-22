
package br.dev.pacotes.funcionarios.view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModelFuncionarios extends AbstractTableModel {

    ArrayList<Funcionario> funcionarios = new ArrayList();
    
    String []colunas = {"Nome", "Cpf", "Endereco", "Area"};
    
     public void cadastrarFuncionario(Funcionario f){
         funcionarios.add(f);
         this.fireTableDataChanged();
     }
     
     public Funcionario returnFuncionario(int index){
         return funcionarios.get(index);
     }
     
     public void alterarFuncionario(int index, Funcionario f){
         funcionarios.set(index, f);
         this.fireTableDataChanged();
     }
      
     
     public void removerFuncionario(int index){
         funcionarios.remove(index);
         this.fireTableDataChanged();
     }
     
    @Override
    public int getRowCount() {
        return funcionarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     if((columnIndex == 0)){
      return funcionarios.get(rowIndex).getNome();  
     } else if(columnIndex == 1){
           return funcionarios.get(rowIndex).getCpf();
     } else if(columnIndex == 2){
         return funcionarios.get(rowIndex).getEndereco();
     } else{
         return funcionarios.get(rowIndex).getArea();
     } 
        
   }
  
}
