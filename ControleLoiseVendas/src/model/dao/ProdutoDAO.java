/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.ConexaoFabrica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author geova
 */
public class ProdutoDAO {
    
    public void create(Produto p){
        
        Connection con = ConexaoFabrica.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto (nome,quantidade,preco) values (?,?,?)");
            
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreco());
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConexaoFabrica.closeConnection(con, stmt);
        }
         
    }
    
    public void update(Produto p){
        
        Connection con = ConexaoFabrica.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produto SET quantidade = ? WHERE id_produto = ?;");
            
            stmt.setInt(1, p.getQuantidade());
            stmt.setInt(2, p.getId());
            
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar venda: "+ex);
        }finally{
            ConexaoFabrica.closeConnection(con, stmt);
        }
         
    }
    
    public List<Produto> read(){
        Connection con = ConexaoFabrica.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        
        try {
            stmt = con.prepareStatement("select * from produto;");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getInt("id_produto"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConexaoFabrica.closeConnection(con, stmt, rs);
        }
        return produtos;
    }
    
    public Produto readProduto(String prod){
        Connection con = ConexaoFabrica.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Produto produto = new Produto();
 
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE nome = ?;");
            stmt.setString(1, prod);
            rs = stmt.executeQuery();
            
            if(rs != null && rs.next()){
                produto.setId(rs.getInt("id_produto"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));
            }else{
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConexaoFabrica.closeConnection(con, stmt, rs);
        }
        return produto;
    }

}
