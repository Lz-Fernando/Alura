using System.Runtime.Serialization;

string mensagemDeBoasVindas = "Boas vindas ao Screen Sound";
//List<string> listaDasBandas = new List<string> { "U2", "The Beatles", "Calypso" };

Dictionary<string, List<int>> BandasRegistradas = new Dictionary<string, List<int>>();
BandasRegistradas.Add("U2", new List<int> { 10, 8, 6 });
BandasRegistradas.Add("The Beatles", new List<int>());

void ExibirLogo()
{
    Console.WriteLine(@"");
    Console.WriteLine(mensagemDeBoasVindas);
}

void ExibirOpcoesDoMenu()
{
    ExibirLogo();
    Console.WriteLine("\nDigite 1 para registrar uma banda");
    Console.WriteLine("Digite 2 para mostrar todas as bandas");
    Console.WriteLine("Digite 3 para avaliar uma banda");
    Console.WriteLine("Digite 4 para exibir a média de uma banda");
    Console.WriteLine("Digite -1 para sair");

    Console.Write("\nDigite a sua opção: ");
    string opcaoEscolhida = Console.ReadLine()!;
    int opcaoEscolhidaNumerica = int.Parse(opcaoEscolhida);

    switch (opcaoEscolhidaNumerica)
    {
        case 1:
            RegistrarBanda();
            break;
        case 2:
            ExibirBandasRegistradas();
            break;
        case 3:
            AvaliarBanda();
            break;
        case 4:
            ExibirMediaDaBanda();
            break;
        case -1:
            Console.WriteLine($"Você escolheu a opção {opcaoEscolhidaNumerica}");
            break;
        default:
            Console.WriteLine("Opção inválida");
            break;
    }
}

void ExibirTituloDaOpcao(string titulo)
{
    int quantidadeDeLetras = titulo.Length;
    string asteriscos = string.Empty.PadLeft(quantidadeDeLetras, '*');
    Console.WriteLine(asteriscos);
    Console.WriteLine(titulo);
    Console.WriteLine(asteriscos + "\n");
}

void RegistrarBanda()
{
    Console.Clear();
    ExibirTituloDaOpcao("Registro de banda");
    Console.Write("Digite a banda que deseja registrar: ");
    string bandaRegistrada = Console.ReadLine()!;
    BandasRegistradas.Add(bandaRegistrada, new List<int>());
    Console.WriteLine($"A banda {bandaRegistrada} foi registrada com sucesso");
    Thread.Sleep(2500);
    Console.Clear();
    ExibirOpcoesDoMenu();
}

void ExibirBandasRegistradas()
{
    Console.Clear();
    ExibirTituloDaOpcao("Exibição de todas as bandas Registradas");

    //for(int i = 0; i < listaDasBandas.Count; i++)
    //{
    //  Console.WriteLine($"Banda: {listaDasBandas[i]}");
    //}

    foreach (string banda in BandasRegistradas.Keys)
    {
        Console.WriteLine($"Banda: {banda}");
    }

    Console.WriteLine("\nPressione uma tecla para voltar ao menu principal");
    Console.ReadKey();
    Console.Clear();
    ExibirOpcoesDoMenu();
}

void AvaliarBanda()
{
    Console.Clear();
    ExibirTituloDaOpcao("Avaliar banda");
    Console.Write("Digite a banda que gostaria de avaliar: ");
    string nomeBanda = Console.ReadLine()!;
    if (BandasRegistradas.ContainsKey(nomeBanda))
    {
        Console.Write($"Qual nota a banda {nomeBanda} merece:");
        int nota = int.Parse(Console.ReadLine()!);
        BandasRegistradas[nomeBanda].Add(nota);
        Console.WriteLine($"A nota {nota} foi atribuida a banda {nomeBanda}");
        Thread.Sleep(3000);
        Console.Clear();
        ExibirOpcoesDoMenu();
    }
    else
    {
        Console.WriteLine("Banda não registrada");
        Console.Write("Pressione Qualquer tecla para voltar");
        Console.ReadKey();
        Console.Clear();
        AvaliarBanda();
    }
}

void ExibirMediaDaBanda()
{
    Console.Clear();
    ExibirTituloDaOpcao("Exibição da nota média das bandas");
    Console.Write("Digite a banda que deseja visualizar a nota média:");
    string nomeBanda = Console.ReadLine()!;

    if (BandasRegistradas.ContainsKey(nomeBanda))
    {
        List<int> notas = BandasRegistradas[nomeBanda];
        Console.WriteLine($"A banda {nomeBanda} possui uma nota média de {notas.Average()}");
        Console.Write("\nPressione qualquer tecla para retornar");
        Console.ReadKey();
        Console.Clear();
        ExibirOpcoesDoMenu();
    } else
    {
        Console.WriteLine($"A banda {nomeBanda} não está registrada no sistema");
        Console.Write("Pressione qualquer tecla para retornar");
        Console.ReadKey();
        Console.Clear();
        ExibirMediaDaBanda();
    }
}

ExibirOpcoesDoMenu();