package proj_aula;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class App extends JFrame 
{
	JMenuBar barra;
	JMenu funcionarios, produtos, clientes, fornecedores, servicos;
	JMenuItem estoque, cadcli, conscli, cadveic, consveic, cadfunc, consfunc, cadprod, consprod, cadserv, consserv, cadforn, consforn, sobre, cadcar, conscar, ordserv, cadordemservico, consordemservico;
	ImageIcon func, prod, cli, forn, serv, est, abt;
	public App() {
		super("RPM Mechanics");
		final Container tela = getContentPane();
		tela.setLayout(null);
		
		cli = new ImageIcon("client.png");
		cli.setImage(cli.getImage().getScaledInstance(25,25,100));
		prod = new ImageIcon("product.png");
		prod.setImage(prod.getImage().getScaledInstance(25,25,100));
		serv = new ImageIcon("servicos.png");
		serv.setImage(serv.getImage().getScaledInstance(25,25,100));
		forn = new ImageIcon("fornecedores.png");
		forn.setImage(forn.getImage().getScaledInstance(25,25,100));
		func = new ImageIcon("funcionarios.png");
		func.setImage(func.getImage().getScaledInstance(25,25,100));
		est = new ImageIcon("estoque.png");
		est.setImage(est.getImage().getScaledInstance(25,25,100));
		abt = new ImageIcon("about.png");
		abt.setImage(abt.getImage().getScaledInstance(25,25,100));
		
		barra = new JMenuBar();
		funcionarios = new JMenu("Funcionários");
		funcionarios.setIcon(func);
		produtos = new JMenu("Produtos");
		produtos.setIcon(prod);
		clientes = new JMenu("Clientes");
		clientes.setIcon(cli);
		fornecedores = new JMenu("Fornecedores");
		fornecedores.setIcon(forn);
		servicos = new JMenu("Serviços");
		servicos.setIcon(serv);
		estoque = new JMenuItem("Estoque");
		estoque.setIcon(est);
		sobre = new JMenuItem("Sobre");
		ordserv = new JMenuItem("Ordem de Serviço");
		sobre.setIcon(abt);
		
		cadcli = new JMenuItem("Cadastrar Cliente");
		conscli = new JMenuItem("Consultar Clientes");
		cadcar = new JMenuItem("Cadastrar Veículo");
		conscar = new JMenuItem("Consultar Veículo");
		cadfunc = new JMenuItem("Cadastrar Funcionário");
		consfunc = new JMenuItem("Consultar Funcionários");
		cadprod = new JMenuItem("Cadastrar Produto");
		consprod = new JMenuItem("Consultar Produtos");
		cadserv = new JMenuItem("Cadastrar Serviço");
		consserv = new JMenuItem("Consultar Serviços");
		cadforn = new JMenuItem("Cadastrar Fornecedor");
		consforn = new JMenuItem("Consultar Fornecedor");
        cadordemservico = new JMenuItem("Cadastrar Ordem de Serviço");
        consordemservico = new JMenuItem("Consultar Ordem de Serviço");
		
		cadcli.setFont(new Font("Century Gothic", 0, 15));
		conscli.setFont(new Font("Century Gothic", 0, 15));
		cadcar.setFont(new Font("Century Gothic", 0, 15));
		conscar.setFont(new Font("Century Gothic", 0, 15));
		cadforn.setFont(new Font("Century Gothic", 0, 15));
		consforn.setFont(new Font("Century Gothic", 0, 15));
		cadserv.setFont(new Font("Century Gothic", 0, 15));
		consserv.setFont(new Font("Century Gothic", 0, 15));
		cadfunc.setFont(new Font("Century Gothic", 0, 15));
		consfunc.setFont(new Font("Century Gothic", 0, 15));
		cadprod.setFont(new Font("Century Gothic", 0, 15));
		ordserv.setFont(new Font("Century Gothic", 0, 15));
		consprod.setFont(new Font("Century Gothic", 0, 15));
        cadordemservico.setFont(new Font("Century Gothic", 0, 15));
        consordemservico.setFont(new Font("Century Gothic", 0, 15));
		clientes.setFont(new Font("Century Gothic", 1, 16));
		produtos.setFont(new Font("Century Gothic", 1, 16));
		servicos.setFont(new Font("Century Gothic", 1, 16));
		fornecedores.setFont(new Font("Century Gothic", 1, 16));
		funcionarios.setFont(new Font("Century Gothic", 1, 16));
		estoque.setFont(new Font("Century Gothic", 1, 16));
		sobre.setFont(new Font("Century Gothic", 1, 16));
		
		barra.setBackground(Color.WHITE);
		estoque.setBackground(Color.WHITE);
		sobre.setBackground(Color.WHITE);
		
		setJMenuBar(barra);
		barra.add(clientes);
		barra.add(produtos);
		barra.add(servicos);
		barra.add(fornecedores);
		barra.add(funcionarios);
		barra.add(estoque);
		clientes.add(cadcli);
		clientes.add(conscli);
		clientes.add(cadcar);
		clientes.add(conscar);
		funcionarios.add(cadfunc);
		funcionarios.add(consfunc);
		servicos.add(cadserv);
		servicos.add(consserv);
        servicos.add(cadordemservico);
        servicos.add(consordemservico);
		produtos.add(cadprod);
		produtos.add(consprod);
		fornecedores.add(cadforn);
		fornecedores.add(consforn);
		barra.add(sobre);
		
		cadfunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadFunc cadf = new CadFunc();
				tela.add(cadf);
			}
		});
		
		consfunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsFunc consf = new ConsFunc();
				tela.add(consf);
			}
		});
		
		cadcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadCar cadc = new CadCar();
				tela.add(cadc);
			}
		});
		
		conscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsCar consc = new ConsCar();
				tela.add(consc);
			}
		});
		
                cadordemservico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadOrdemServico cados = new CadOrdemServico();
				tela.add(cados);
			}
		});
		
		consordemservico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsOrdemServico consos = new ConsOrdemServico();
				tela.add(consos);
			}
		});
                
		setLocationRelativeTo(null);
		setVisible(true);
		setSize(820,500);
		setResizable(false);
	}
    public static void main( String[] args )
    {
        App app = new App();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}