import cadastroFichas.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        Ocultista ocultista1 = new Ocultista(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        System.out.print("Digite o nome do personagem(ocultista): ");
        ocultista1.setNome_personagem(scanner.nextLine());

        System.out.print("Digite a idade do personagem(ocultista): ");
        ocultista1.setIdade_personagem(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da força do personagem(ocultista): ");
        ocultista1.setForca(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da agilidade do personagem(ocultista): ");
        ocultista1.setAgilidade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor do intelecto do personagem(ocultista): ");
        ocultista1.setIntelecto(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Digite o valor de vigor do personagem(ocultista): ");
        ocultista1.setVigor(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de presença do personagem(ocultista): ");
        ocultista1.setPresenca(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nivel de exposição do personagem(ocultista): ");
        ocultista1.setNivel_exposicao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nivel de sanidade do personagem(ocultista): ");
        ocultista1.setSanidade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite os pontos de esforço do personagem(ocultista): ");
        ocultista1.setPontos_esforcos(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite a quantidade de vida do personagem(ocultista): ");
        ocultista1.setVida(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de deslocamento do personagem(ocultista): ");
        ocultista1.setDeslocamento(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite os pontos de esforço por rodada do personagem(ocultista): ");
        ocultista1.setP_e_rodada(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de ocultismo do personagem(ocultista): ");
        ocultista1.setOcultismo(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da vontade do personagem(ocultista): ");
        ocultista1.setVontade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de intuição do personagem(ocultista): ");
        ocultista1.setIntuicao(scanner.nextInt());
        scanner.nextLine();
        


        Combatente combatente1 = new Combatente(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        System.out.print("Digite o nome do personagem(combatente): ");
        combatente1.setNome_personagem(scanner.nextLine());

        System.out.print("Digite a idade do personagem(combatente): ");
        combatente1.setIdade_personagem(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da força do personagem(combatente): ");
        combatente1.setForca(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da agilidade do personagem(combatente): ");
        combatente1.setAgilidade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de intelecto do personagem(combatente): ");
        combatente1.setIntelecto(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Digite o valor do vigor do personagem(combatente): ");
        combatente1.setVigor(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de presença do personagem(combatente): ");
        combatente1.setPresenca(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nivel de exposição do personagem(combatente): ");
        combatente1.setNivel_exposicao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nivel de sanidade do personagem(combatente): ");
        combatente1.setSanidade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite os pontos de esforço do personagem(combatente): ");
        combatente1.setPontos_esforcos(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de vida do personagem(combatente): ");
        combatente1.setVida(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de deslocamento do personagem(combatente): ");
        combatente1.setDeslocamento(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite os pontos de esforço por rodada do personagem(combatente): ");
        combatente1.setP_e_rodada(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de luta do personagem(combatente): ");
        combatente1.setLuta(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de fortitude do personagem(combatente): ");
        combatente1.setFortitude(scanner.nextInt());
        scanner.nextLine();



        Especialista especialista1 = new Especialista(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        
        System.out.print("Digite o nome do personagem(especialista): ");
        especialista1.setNome_personagem(scanner.nextLine());

        System.out.print("Digite a idade do personagem(especialista): ");
        especialista1.setIdade_personagem(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da força do personagem(especialista): ");
        especialista1.setForca(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da agilidade do personagem(especialista): ");
        especialista1.setAgilidade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor do intelecto do personagem(especialista): ");
        especialista1.setIntelecto(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Digite o valor do vigor do personagem(especialista): ");
        especialista1.setVigor(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da presença do personagem(especialista): ");
        especialista1.setPresenca(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nivel de exposição do personagem(especialista): ");
        especialista1.setNivel_exposicao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nivel de sanidade do personagem(especialista): ");
        especialista1.setSanidade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite os pontos de esforço do personagem(especialista): ");
        especialista1.setPontos_esforcos(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite a quantidade de vida do personagem(especialista): ");
        especialista1.setVida(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de deslocamento do personagem(especialista): ");
        especialista1.setDeslocamento(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite os pontos de esforço por rodada do personagem(especialista): ");
        especialista1.setP_e_rodada(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de investigação do personagem(especialista): ");
        especialista1.setInvestigacao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de percepção do personagem(especialista): ");
        especialista1.setPercepcao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de pontaria do personagem(especialista): ");
        especialista1.setPontaria(scanner.nextInt());
        scanner.nextLine();



        Pericias pericia1 = new Pericias(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        
        System.out.print("Digite o nome do personagem(pericia): ");
        pericia1.setNome_personagem(scanner.nextLine());

        System.out.print("Digite a idade do personagem(pericia): ");
        pericia1.setIdade_personagem(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da força do personagem(pericia): ");
        pericia1.setForca(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da agilidade do personagem(pericia): ");
        pericia1.setAgilidade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor do intelecto do personagem(pericia): ");
        pericia1.setIntelecto(scanner.nextInt());
        scanner.nextLine();
        
        System.out.print("Digite o valor do vigor do personagem(pericia): ");
        pericia1.setVigor(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor da presença do personagem(pericia): ");
        pericia1.setPresenca(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nivel de exposição do personagem(pericia): ");
        pericia1.setNivel_exposicao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o nivel de sanidade do personagem(pericia): ");
        pericia1.setSanidade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite os pontos de esforço do personagem(pericia): ");
        pericia1.setPontos_esforcos(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite a quantidade de vida do personagem(pericia): ");
        pericia1.setVida(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de deslocamento do personagem(pericia): ");
        pericia1.setDeslocamento(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite os pontos de esforço por rodada do personagem(pericia): ");
        pericia1.setP_e_rodada(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de acrobacia do personagem(pericia): ");
        pericia1.setAcrobacia(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de atletismo do personagem(pericia): ");
        pericia1.setAtletismo(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de enganação do personagem(pericia): ");
        pericia1.setEnganacao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de fortitude do personagem(pericia): ");
        pericia1.setFortitude(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de furtividade do personagem(pericia): ");
        pericia1.setFurtividade(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de intimidação do personagem(pericia): ");
        pericia1.setIntimidacao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de intuição do personagem(pericia): ");
        pericia1.setIntuicao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de investigação do personagem(pericia): ");
        pericia1.setInvestigacao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de luta do personagem(pericia): ");
        pericia1.setLuta(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de medicina do personagem(pericia): ");
        pericia1.setMedicina(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de percepcao do personagem(pericia): ");
        pericia1.setPercepcao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de pilotagem do personagem(pericia): ");
        pericia1.setPilotagem(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de pontaria do personagem(pericia): ");
        pericia1.setPontaria(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de reflexos do personagem(pericia): ");
        pericia1.setReflexos(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de sobrevivencia do personagem(pericia): ");
        pericia1.setSobrevivencia(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de tatica do personagem(pericia): ");
        pericia1.setTatica(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Digite o valor de tecnologia do personagem(pericia): ");
        pericia1.setTecnologia(scanner.nextInt());
        scanner.nextLine();

        Missao missao1;

        System.out.print("Digite o nome da missão: ");
        String nomeMissao = scanner.nextLine();

        System.out.print("Digite a dificuldade da missão: ");
        String dificuldadeMissao = scanner.nextLine();

        System.out.print("Digite a recompensa da missão: ");
        String recompensaMissao = scanner.nextLine();

        System.out.print("Digite a descrição da missão: ");
        String descricaoMissao = scanner.nextLine();

        missao1 = new Missao(nomeMissao, dificuldadeMissao, recompensaMissao, descricaoMissao);
        
        System.out.println("\nPersonagens cadastrados");
        ocultista1.habilidades();
        combatente1.habilidades();
        especialista1.habilidades();
        pericia1.habilidades();

        System.out.println("\nDetalhes da Missão:");
        missao1.exibirDetalhes();

        scanner.close();
    }
}
