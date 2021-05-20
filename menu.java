//  menu principal
private static void menu() { // menu principal
	int opcao = 0;
	do {
		System.out.println("\n\n### SOPHIS LOJAS - CONTROLE DE COMPRA DE VENDA ###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Venda         |");
		System.out.println("                  |     2 - Vendedor      |");
		System.out.println("                  |     3 - Compras       |");
		System.out.println("                  |     4 - Produtos      |");
		System.out.println("                  |     5 - Clientes      |");
		System.out.println("                  |     6 - Fornecedor    |");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");

		opcao = Console.readInt("Opção -> ");
		System.out.print("\n");
		switch (opcao) {
		case 1:
            Venda();
            System.out.println("\nHoje tivemos 20 vendas");
			break;
		case 2:
			Vendedor();
            System.out.println("\nTemos o Robson e a Vanessa, como vendedores");
			break;
        case 3:
			Compras();
            System.out.println("\nFizemos um investimento em novos produtos de decoração");
			break;
        case 4:
			Produtos();
            System.out.println("\nTemos em estoque: travesseiro,suporte de tv, vasos, molduras e quadros");
			break;         
        case 5:
			Clientes();
            System.out.println("\nHoje tivemos 27 pessoas na loja");
			break;
        case 6:
			Fornecedor();
            System.out.println("\nNosso fornecedor é 'CASANOVA'");
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
	} while (opcao != 0);
}