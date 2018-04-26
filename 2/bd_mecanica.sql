-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 24-Abr-2018 às 14:30
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bd_mecanica`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_clientes`
--

CREATE TABLE `tb_clientes` (
  `id_cliente` int(11) NOT NULL,
  `tipo_pessoa` set('F','J') NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `data_nasc` date NOT NULL,
  `tel_residencial` varchar(13) DEFAULT NULL,
  `tel_celular` varchar(14) DEFAULT NULL,
  `email` varchar(40) NOT NULL,
  `endereco` varchar(60) NOT NULL,
  `numero` varchar(4) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `uf` set('SP','MG','RJ','ES','BA','PE','RS','AC','AL','AP','AM','CE','DF','GO','MA','MT','MS','PA','PB','PR','PI','RN','RO','RR','SC','SE','TO') NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_fornecedores`
--

CREATE TABLE `tb_fornecedores` (
  `id_fornecedor` int(11) NOT NULL,
  `telefone_1` varchar(14) NOT NULL,
  `telefone_2` varchar(14) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `e-mail` varchar(70) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_fornecimento`
--

CREATE TABLE `tb_fornecimento` (
  `id_fornecimento` int(11) NOT NULL,
  `id_prod` int(11) NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `data_entrega` date NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor_total` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_funcionarios`
--

CREATE TABLE `tb_funcionarios` (
  `id_func` int(11) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `salario` double NOT NULL,
  `sexo` set('Masculino','Feminino') NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `data_nasc` date NOT NULL,
  `tel_residencial` varchar(13) DEFAULT NULL,
  `tel_celular` varchar(14) DEFAULT NULL,
  `email` varchar(40) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `endereco` varchar(60) NOT NULL,
  `numero` varchar(4) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `uf` set('SP','MG','RJ','ES','BA','PE','RS','AC','AL','AP','AM','CE','DF','GO','MA','MT','MS','PA','PB','PR','PI','RN','RO','RR','SC','SE','TO') NOT NULL,
  `bairro` varchar(30) NOT NULL,
  `cidade` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_ordserv`
--

CREATE TABLE `tb_ordserv` (
  `id_ordserv` int(11) NOT NULL,
  `id_func` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_veic` int(11) NOT NULL,
  `valortotal` varchar(7) NOT NULL,
  `dataent` date NOT NULL,
  `datafin` date NOT NULL,
  `id_prod` int(11) DEFAULT NULL,
  `id_servico` int(11) DEFAULT NULL,
  `descricao` varchar(85) NOT NULL,
  `observacoes` varchar(70) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produtos`
--

CREATE TABLE `tb_produtos` (
  `id_prod` int(11) NOT NULL,
  `nome_prod` varchar(50) NOT NULL,
  `categ_prod` set('Acessórios','Arrefecimento','Câmbio e Direção','Coxins e Batentes','Embreagem','Ferramentas e Limpezas','Freios','Iluminação','Injeção','Motor','Óleo Filtro e Aditivos','Parachoque','Pneus','Rolamentos','Segurança','Sistema Elétrico','Multimídia','Suspensão','Tuning','Volantes') NOT NULL,
  `valor_prod` float NOT NULL,
  `desc_prod` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_servicos`
--

CREATE TABLE `tb_servicos` (
  `id_servico` int(11) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `categoria` set('Alinhamento','Balanceamento','Mecânica em Geral','Limpeza de ar condicionado','Limpeza de bicos','Trocas de óleos e filtros','revisão geral/freios','Serviços Elétricos','Testar carga de bateria','Injeção Eletrônica','Check-up de Suspenção','Cambagem e Caster','Escapamento','Pneus','Elétrica Geral','Lava e Traz') NOT NULL,
  `valor` varchar(7) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_veic`
--

CREATE TABLE `tb_veic` (
  `id_veic` int(11) NOT NULL,
  `tipo` set('Automóvel','Motocicleta','Caminhão','Caminhonete','Ônibus','Microônibus') NOT NULL,
  `placa` varchar(8) NOT NULL,
  `ano` int(4) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(40) NOT NULL,
  `cor` varchar(25) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `ar_condicionado` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_clientes`
--
ALTER TABLE `tb_clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indexes for table `tb_fornecedores`
--
ALTER TABLE `tb_fornecedores`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Indexes for table `tb_fornecimento`
--
ALTER TABLE `tb_fornecimento`
  ADD PRIMARY KEY (`id_fornecimento`);

--
-- Indexes for table `tb_funcionarios`
--
ALTER TABLE `tb_funcionarios`
  ADD PRIMARY KEY (`id_func`);

--
-- Indexes for table `tb_ordserv`
--
ALTER TABLE `tb_ordserv`
  ADD PRIMARY KEY (`id_ordserv`);

--
-- Indexes for table `tb_produtos`
--
ALTER TABLE `tb_produtos`
  ADD PRIMARY KEY (`id_prod`);

--
-- Indexes for table `tb_servicos`
--
ALTER TABLE `tb_servicos`
  ADD PRIMARY KEY (`id_servico`);

--
-- Indexes for table `tb_veic`
--
ALTER TABLE `tb_veic`
  ADD PRIMARY KEY (`id_veic`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_clientes`
--
ALTER TABLE `tb_clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_fornecedores`
--
ALTER TABLE `tb_fornecedores`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_fornecimento`
--
ALTER TABLE `tb_fornecimento`
  MODIFY `id_fornecimento` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_funcionarios`
--
ALTER TABLE `tb_funcionarios`
  MODIFY `id_func` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_ordserv`
--
ALTER TABLE `tb_ordserv`
  MODIFY `id_ordserv` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_produtos`
--
ALTER TABLE `tb_produtos`
  MODIFY `id_prod` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_servicos`
--
ALTER TABLE `tb_servicos`
  MODIFY `id_servico` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tb_veic`
--
ALTER TABLE `tb_veic`
  MODIFY `id_veic` int(11) NOT NULL AUTO_INCREMENT;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
