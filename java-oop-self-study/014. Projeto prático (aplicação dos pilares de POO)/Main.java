public class Main {
    public static void main(String[] args) {
        System.out.println("🎬 Bem-vindo à MiniPlataforma de Vídeos!\n");

        // Criando usuários
        Usuario u1 = new Usuario("Alice", 25, "F", "alice25");
        Usuario u2 = new Usuario("Bruno", 30, "M", "brunotv");

        // Criando vídeos
        Video v1 = new Video("Como programar em Java");
        Video v2 = new Video("Estruturas de Dados: Conceitos Básicos");
        Video v3 = new Video("Os 10 melhores editores de código");

        // Exibindo início
        System.out.println("📹 Vídeos disponíveis:");
        System.out.println("- " + v1.getTitulo());
        System.out.println("- " + v2.getTitulo());
        System.out.println("- " + v3.getTitulo());
        System.out.println();

        // Simulando visualizações
        Visualizacao vis1 = new Visualizacao(u1, v1);
        vis1.avaliar(5, "Conteúdo excelente e didático!");

        Visualizacao vis2 = new Visualizacao(u2, v2);
        vis2.avaliar(4, "Muito bom, mas poderia ter mais exemplos.");

        Visualizacao vis3 = new Visualizacao(u1, v2);
        vis3.avaliar(5); // avaliação no limite superior

        Visualizacao vis4 = new Visualizacao(u2, v3);
        vis4.avaliar(7); // nota inválida

        // Interações com vídeo
        v1.play();
        v1.like();
        v1.pause();

        // Resumo dos vídeos
        System.out.println("\n📊 Resumo dos vídeos:");
        exibirResumoVideo(v1);
        exibirResumoVideo(v2);
        exibirResumoVideo(v3);

        // Resumo dos usuários
        System.out.println("\n👤 Resumo dos usuários:");
        exibirResumoUsuario(u1);
        exibirResumoUsuario(u2);
    }

    public static void exibirResumoVideo(Video video) {
        System.out.println("🎥 Título: " + video.getTitulo());
        System.out.println("▶ Visualizações: " + video.getVisualizacoes());
        System.out.println("👍 Curtidas: " + video.getCurtidas());
        System.out.println("💬 Avaliações:");
        if (video.getAvaliacoes().isEmpty()) {
            System.out.println("  - Nenhuma avaliação até o momento.");
        } else {
            for (Avaliacao a : video.getAvaliacoes()) {
                System.out.println("  - Nota: " + a.getNota() + " | Comentário: " + a.getComentario());
            }
        }
        System.out.println();
    }

    public static void exibirResumoUsuario(Usuario u) {
        System.out.println("👤 Nome: " + u.getNome());
        System.out.println("📛 Login: " + u.getLogin());
        System.out.println("📺 Total de vídeos assistidos: " + u.getTotalAssistido());
        System.out.println("🌟 Experiência: " + u.getExperiencia());
        System.out.println();
    }
}