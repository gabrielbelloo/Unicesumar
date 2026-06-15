// 1.1 Emitir recibo de compra
public void emitirRecibo(String cliente, int quantidade, double precoUnitario) {
    double subtotal = calcularSubtotal(quantidade, precoUnitario);
    double imposto = calcularImposto(subtotal);
    double total = subtotal + imposto;

    imprimirRecibo(cliente, quantidade, precoUnitario, subtotal, imposto, total);

    verificarTipoCompra(total);
}

private double calcularSubtotal(int quantidade, double precoUnitario){
    return quantidade * precoUnitario;
}

private double calcularImposto(double subtotal){
    return subtotal * 0.10;
}

private void imprimirRecibo(String cliente, int quantidade, double precoUnitario, double subtotal, double imposto, double total){
    System.out.println("Cliente: " + cliente);
    System.out.println("Quantidade: " + quantidade);
    System.out.println("Preço unitário: R$ " + precoUnitario);
    System.out.println("Subtotal: R$ " + subtotal);
    System.out.println("Imposto: R$ " + imposto);
    System.out.println("Total: R$ " + total);
}

private void verificarTipoCompra(double total){
    if (total > 500) {
        System.out.println("Compra de alto valor");
    } else {
        System.out.println("Compra comum");
    }
}

// 1.2. Processar matrícula
public void processarMatricula(String aluno, int disciplinas, boolean bolsista) {
    double valorBase = calcularValorBase(disciplinas);
    double desconto = calcularDesconto(bolsista, valorBase);
    double valorFinal = valorBase - desconto;

    imprimirMatricula(aluno, disciplinas, valorBase, desconto, valorFinal);
    verificarSituacao(valorFinal);
}

private double calcularValorBase(int disciplinas){
    return disciplinas * 120.0;
}

private double calcularDesconto(boolean bolsista, double valorBase){
    double desconto = 0;
    if (bolsista) {
        desconto = valorBase * 0.4;
    }
    return desconto;
}

private void imprimirMatricula(String aluno, int disciplinas, double valorBase, double desconto, double valorFinal){
    System.out.println("Aluno: " + aluno);
    System.out.println("Disciplinas: " + disciplinas);
    System.out.println("Valor base: R$ " + valorBase);
    System.out.println("Desconto: R$ " + desconto);
    System.out.println("Valor final: R$ " + valorFinal);
}

private void verificarSituacao(double valorFinal){
    if (valorFinal == 0) {
        System.out.println("Matrícula gratuita");
    } else {
        System.out.println("Pagamento necessário");
    }
}

//1.3. Gerar relatório de funcionário
public void gerarRelatorioFuncionario(String nome, int horas, double valorHora) {
    double salarioBruto = calcularSalarioBruto(horas, valorHora);
    double desconto = calcularDesconto(salarioBruto);
    double salarioLiquido = salarioBruto - desconto;

    imprimirRelatorioFuncionarios(nome, horas, valorHora, salarioBruto, desconto, salarioLiquido);
    verificarFaixaSalarial(salarioLiquido);
}

private double calcularSalarioBruto(int horas, double valorHora){
    return horas * valorHora;
}

private double calcularDesconto(double salarioBruto){
    return salarioBruto * 0.08;
}

private void imprimirRelatorioFuncionarios(String nome, int horas, double valorHora, double salarioBruto, double desconto, double salarioLiquido){
    System.out.println("Funcionário: " + nome);
    System.out.println("Horas trabalhadas: " + horas);
    System.out.println("Valor da hora: R$ " + valorHora);
    System.out.println("Salário bruto: R$ " + salarioBruto);
    System.out.println("Desconto: R$ " + desconto);
    System.out.println("Salário líquido: R$ " + salarioLiquido);
}

private void verificarFaixaSalarial(double salarioLiquido){
    if (salarioLiquido >= 3000) {
        System.out.println("Faixa salarial alta");
    } else {
        System.out.println("Faixa salarial comum");
    }
}

//1.4. Finalizar venda online
public void finalizarVenda(String produto, int quantidade, double preco, boolean entregaExpressa) {
    double subtotal = calcularSubtotal(quantidade, preco);
    double frete = calcularFrete(entregaExpressa);
    double total = subtotal + frete;

    imprimirResumoVenda(produto, quantidade, preco, frete, total);
    verificarTipoEntrega(entregaExpressa);
}

private double calcularSubtotal(int quantidade, double preco){
    return quantidade * preco;
}

private double calcularFrete(boolean entregaExpressa){
    double frete = 20;
    if (entregaExpressa) {
        frete = 40;
    }
    return frete;
}

private void imprimirResumoVenda(String produto, int quantidade, double preco, double frete, double total){
    System.out.println("Produto: " + produto);
    System.out.println("Quantidade: " + quantidade);
    System.out.println("Preço: R$ " + preco);
    System.out.println("Frete: R$ " + frete);
    System.out.println("Total: R$ " + total);
}

private void verificarTipoEntrega(boolean entregaExpressa){
    if (entregaExpressa) {
        System.out.println("Entrega expressa selecionada");
    } else {
        System.out.println("Entrega comum selecionada");
    }
}

//1.5. Avaliar pedido de empréstimo
public void avaliarEmprestimo(String cliente, double renda, double valorSolicitado) {
    double limite = calcularLimite(renda);
    double parcela = calcularParcela(valorSolicitado);

    imprimirEmprestimo(cliente, renda, valorSolicitado, parcela, limite);
    verificarSituacaoEmprestimo(parcela, limite);
}

private double calcularLimite(double renda){
    return renda * 0.3;
}

private double calcularParcela(double valorSolicitado){
    return valorSolicitado / 12;
}

private void imprimirEmprestimo(String cliente, double renda, double valorSolicitado, double parcela, double limite){
    System.out.println("Cliente: " + cliente);
    System.out.println("Renda mensal: R$ " + renda);
    System.out.println("Valor solicitado: R$ " + valorSolicitado);
    System.out.println("Parcela estimada: R$ " + parcela);
    System.out.println("Limite recomendado: R$ " + limite);
}

private void verificarSituacaoEmprestimo(double parcela, double limite){
    if (parcela <= limite) {
        System.out.println("Empréstimo aprovado");
    } else {
        System.out.println("Empréstimo negado");
    }
}

//2.1. Verificar aprovação em disciplina
public void verificarAprovacao(double notaFinal, int frequencia, boolean fezRecuperacao) {
    boolean aprovado = notaFinal >= 6.0 && frequencia >= 75;
    boolean aprovadoRecuperacao = fezRecuperacao && notaFinal >= 5.0 && frequencia >= 80;

    if (aprovado || aprovadoRecuperacao) {
        System.out.println("Aluno aprovado");
    } else {
        System.out.println("Aluno reprovado");
    }
}

//2.2. Verificar acesso ao sistema
public void verificarAcesso(boolean usuarioAtivo, boolean senhaCorreta, boolean admin, boolean bloqueado) {
    boolean acessoLiberadoUsuario = usuarioAtivo && senhaCorreta && !bloqueado;
    boolean acessoLiberadoAdmin = admin && senhaCorreta;

    if (acessoLiberadoUsuario || acessoLiberadoAdmin) {
        System.out.println("Acesso liberado");
    } else {
        System.out.println("Acesso negado");
    }
}

//2.3. Avaliar entrega de trabalho
public void avaliarEntrega(boolean entregouNoPrazo, double nota, boolean justificativaAceita) {
    boolean trabalhoAceitoEntregaNormal = entregouNoPrazo && nota >= 6.0;
    boolean trabalhoAceitoEntregaComJustificativa = !entregouNoPrazo && justificativaAceita && nota >= 7.0;

    if (trabalhoAceitoEntregaNormal || trabalhoAceitoEntregaComJustificativa) {
        System.out.println("Trabalho aceito");
    } else {
        System.out.println("Trabalho recusado");
    }
}

//2.4. Verificar desconto em compra
public void verificarDesconto(double totalCompra, boolean clientePremium, int quantidadeItens) {
    boolean descontoAplicavelClienteNormal = totalCompra >= 300 && quantidadeItens >= 3;
    boolean descontoAplicavelClientePremium = clientePremium && totalCompra >= 150;

    if (descontoAplicavelClienteNormal || descontoAplicavelClientePremium) {
        System.out.println("Desconto aplicado");
    } else {
        System.out.println("Sem desconto");
    }
}

//2.5. Verificar disponibilidade de reserva
public void verificarReserva(boolean salaDisponivel, int participantes, boolean eventoInstitucional) {
    boolean reservaPermitidaSalaDisponivel = salaDisponivel && participantes <= 40;
    boolean reservaPermitidaEventoInstitucional = eventoInstitucional && participantes <= 60;

    if (reservaPermitidaSalaDisponivel || reservaPermitidaEventoInstitucional) {
        System.out.println("Reserva permitida");
    } else {
        System.out.println("Reserva recusada");
    }
}

//3.1. Validar idade mínima
public void cadastrarParticipante(int idade) {
    if (idade >= 18) {
        System.out.println("Cadastro permitido");
    } else {
        System.out.println("Cadastro negado");
    }
}

//3.2. Verificar valor mínimo de pedido
public void confirmarPedido(double total) {
    if (total >= 50) {
        System.out.println("Pedido confirmado");
    } else {
        System.out.println("Valor mínimo não atingido");
    }
}

//3.3. Verificar nota suficiente
public void publicarResultado(double nota) {
    if (nota >= 6.0) {
        System.out.println("Resultado: aprovado");
    } else {
        System.out.println("Resultado: reprovado");
    }
}

//3.4. Verificar limite de participantes
public void inscreverEmEvento(int participantes) {
    if (participantes >= 100) {
        System.out.println("Inscrição realizada");
    } else {
        System.out.println("Evento lotado");
    }
}

//3.5. Verificar frete grátis
public void exibirTipoFrete(double totalCompra) {
    if (totalCompra >= 200) {
        System.out.println("Frete grátis");
    } else {
        System.out.println("Frete pago");
    }
}

//4.1. Verificar maioridade
public void verificarMaioridade(int idade) {
    if (idade >= 18) {
        System.out.println("Pessoa maior de idade");
    } else {
        System.out.println("Pessoa menor de idade");
    }
}

//4.2. Verificar média final
public void verificarMedia(double prova1, double prova2) {
    if ((prova1 + prova2) / 2 >= 6.0) {
        System.out.println("Aluno aprovado");
    } else {
        System.out.println("Aluno reprovado");
    }
}

//4.3. Verificar estoque baixo
public void verificarEstoque(int quantidade) {
    if (quantidade < 10) {
        System.out.println("Estoque baixo");
    } else {
        System.out.println("Estoque suficiente");
    }
}

//4.4. Verificar bônus salarial
public void verificarBonus(double salario) {
    if (salario < 2500) {
        System.out.println("Funcionário recebe bônus");
    } else {
        System.out.println("Funcionário não recebe bônus");
    }
}

//4.5. Verificar aprovação de projeto
public void verificarProjeto(double notaDocumento, double notaApresentacao) {
    if ((notaDocumento * 0.6) + (notaApresentacao * 0.4) >= 7.0) {
        System.out.println("Projeto aprovado");
    } else {
        System.out.println("Projeto precisa de revisão");
    }
}