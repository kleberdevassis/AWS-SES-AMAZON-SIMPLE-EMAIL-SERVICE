# AWS-SES-AMAZON-SIMPLE-EMAIL-SERVICE
# Projeto de Integração com Amazon Simple Email Service (SES)

Este é um projeto de exemplo que demonstra como integrar o Amazon Simple Email Service (SES) em uma aplicação Java usando o Spring Framework. O projeto inclui componentes que permitem o envio de e-mails através do SES, com tratamento de exceções personalizado.

## Ativação do Amazon SES

Antes de usar este projeto em um ambiente de produção, é essencial realizar as ativações necessárias no Amazon SES. Aqui estão os passos recomendados:

1. **Configuração de Credenciais**: Certifique-se de que suas credenciais da AWS estejam configuradas corretamente. Isso envolve a criação de chaves de acesso (ID da chave de acesso e chave de acesso secreta) e a configuração do AWS CLI ou das variáveis de ambiente.

2. **Verificação de Domínio**: No Amazon SES, é necessário verificar o domínio a partir do qual deseja enviar e-mails. Siga as etapas na documentação da AWS para verificar seu domínio.

3. **Solicitação de Aumento de Limites**: O SES impõe limites iniciais no envio de e-mails. Para enviar grandes volumes de e-mails, é necessário solicitar um aumento de limites à AWS. Esta etapa é essencial para evitar limitações em sua capacidade de envio de e-mails.

## Como Usar

Para usar este projeto, siga estas etapas:

1. Configure suas credenciais do Amazon SES no arquivo de configuração do AWS SDK.
2. Inicie o aplicativo Spring Boot executando `TestAwsEmailApplication.java`.
3. Use a API REST fornecida por `sendEmailController` para enviar e-mails.

Este projeto é um exemplo simples de como integrar o Amazon SES em sua aplicação Java e gerenciar erros de envio de e-mails.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests e relatar problemas.

---

**Nota**: Certifique-se de seguir as práticas de segurança e as diretrizes da AWS ao trabalhar com o Amazon SES em um ambiente de produção.

