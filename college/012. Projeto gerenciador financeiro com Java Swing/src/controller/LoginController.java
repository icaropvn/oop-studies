package controller;

import java.text.DecimalFormat;
import java.awt.event.*;
import javax.swing.JOptionPane;

import view.MainFrame;
import view.TelaLogin;
import view.TelaPrincipal;
import model.GerenciadorUsuario;
import model.GerenciadorFinanceiro;

public class LoginController {
	private MainFrame mainFrame;
	private TelaLogin telaLogin;
	private GerenciadorUsuario gerenciadorUsuario;
	private GerenciadorFinanceiro gerenciadorFinanceiro;
	private TelaPrincipal telaPrincipal;
	
	public LoginController(MainFrame mainFrame, TelaLogin telaLogin, GerenciadorUsuario gerenciadorUsuario, GerenciadorFinanceiro gerenciadorFinanceiro, TelaPrincipal telaPrincipal) {
		this.mainFrame = mainFrame;
		this.telaLogin = telaLogin;
		this.gerenciadorUsuario = gerenciadorUsuario;
		this.gerenciadorFinanceiro = gerenciadorFinanceiro;
		this.telaPrincipal = telaPrincipal;
		
		initControllers();
	}
	
	public void initControllers() {
		telaLogin.getLoginButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				validarLogin();
			}
		});
		
		telaLogin.setCreateAccountLabelListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainFrame.mostrarTela("cadastro");
			}
		});
	}
	
	public void validarLogin() {
		String nome = telaLogin.getUserInput().getText().trim().toLowerCase();
		String senha = telaLogin.getPasswordInput().getText().trim();
		
		if(nome.isEmpty() || senha.isEmpty()) {
			JOptionPane.showMessageDialog(telaLogin, "Preencha todos os campos.", "Erro ao fazer login", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(!gerenciadorUsuario.validarNomeUsuario(nome) ||
		   !gerenciadorUsuario.validarSenhaUsuario(nome, senha)) {
			JOptionPane.showMessageDialog(telaLogin, "Nome de usuário ou senha inválidos.", "Erro ao fazer login", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		gerenciadorUsuario.setUsuarioAtual(gerenciadorUsuario.getUsuario(nome));
		
		telaPrincipal.setSaudacao("Olá, " + gerenciadorUsuario.getUsuarioAtual().getNome() + "!");
		Object[][] listaTransacoes = gerenciadorFinanceiro.transformarListaEmMatriz(gerenciadorUsuario.getUsuarioAtual().getHistoricoTransacoes());
		telaPrincipal.substituirTabelaTransacoes(listaTransacoes);
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		String saldo = formatador.format(gerenciadorUsuario.getUsuarioAtual().getSaldo());
		telaPrincipal.setSaldo(saldo);
		
		telaLogin.getUserInput().setText("");
		telaLogin.getPasswordInput().setText("");
		
		mainFrame.mostrarTela("principal");
	}
}
