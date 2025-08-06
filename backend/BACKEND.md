# Processo de Desenvolvimento

> 📋 **Índice do Documento**
> - [🔄 Processo de Desenvolvimento](#processo-de-desenvolvimento)
> - [📊 Processo de QA](#processo-de-qa)
> - [🚀 Processo de Release](#processo-de-release)
> - [🔧 Ferramentas e Automação](#ferramentas-e-automação)
> - [📝 Templates e Checklists](#templates-e-checklists)
> - [📈 Métricas e Monitoramento](#métricas-e-monitoramento)

<details>
    <summary>🛠 Visualizar Processo Completo</summary>

![Processo](../.assets/proccess_dev_qa.png)

## 🎯 Definição de Ready (DoR)

Antes de iniciar qualquer desenvolvimento, certifique-se que:

- [ ] **Requisitos bem definidos** - História de usuário clara com critérios de aceitação
- [ ] **Análise técnica concluída** - Arquitetura e dependências mapeadas
- [ ] **Estimativa realizada** - Tempo e complexidade avaliados
- [ ] **Ambiente preparado** - Branch, configurações e dependências prontas
- [ ] **Testes planejados** - Cenários de teste documentados

## 🎯 Definição de Done (DoD)

Uma tarefa só está completa quando:

- [ ] **Código desenvolvido** - Funcionalidade implementada conforme especificação
- [ ] **Testes unitários** - Cobertura mínima de 80%
- [ ] **Testes de integração** - Cenários principais cobertos
- [ ] **Documentação atualizada** - README, diagramas e Gherkin atualizados
- [ ] **Code Review aprovado** - Pelo menos 1 aprovação de dev sênior
- [ ] **Pipeline verde** - Todos os testes automatizados passando
- [ ] **Deploy em homologação** - Funcionalidade testada no ambiente

### <span style="color: green">✨ Novas Funcionalidades</span> - *(quando a solução não existe)*

#### 📋 Etapa 1: Planejamento e Documentação
1. **Product Owner** - Criar user story com critérios de aceitação claros
2. **QA Lead (Pleno/Sênior)** - Revisar requisitos e criar casos de teste iniciais
3. **Tech Lead (Sênior)** - Análise técnica e definição de arquitetura

#### 📝 Etapa 2: Documentação Técnica
4. **QA (Júnior)** - Adicionar seção de ***feature*** no README do módulo
5. **QA Lead (Pleno/Sênior)** - Criar Gherkin detalhado com cenários de teste
6. **DEV (Júnior)** - Criar seção de ***feature*** no README do módulo
7. **DEV (Pleno/Sênior)** - Criar diagramas UML (Classe, Sequência, Componentes)

#### 🧪 Etapa 3: Desenvolvimento de Testes
8. **QA (Júnior/Pleno/Sênior)** - Desenvolver automação de testes (BDD/Cucumber)
9. **DEV (Júnior/Pleno/Sênior)** - Implementar testes unitários e de integração

#### 💻 Etapa 4: Desenvolvimento
10. **DEV (Júnior/Pleno/Sênior)** - Implementar funcionalidade seguindo TDD quando possível
11. **DEV (Pleno/Sênior)** - Code Review obrigatório antes do merge

#### Padrão para Novos Branches (sempre a partir de uma branch de release. Não apagar ao final):
- se nova funcionalidade: feature/[Título-Funcionalidade]
- se novo bug: bug/[Título-Bug]
- se novo spike: spike/[Título-Spike]
#### Padrão de Trabalho nos Branches (sempre a partir de uma branch de feature, 'bug' ou spike. Apagar ao final):
- se funcionalidade: [Responsavel]/[aaaaMMdd-hhMM]/[BACK,FRONT,OTHER]/feature/[Título-Funcionalidade]
- se bug: [Responsavel]/[aaaaMMdd-hhMM]/[BACK,FRONT,OTHER]/bug/[Título-Bug]
- se spike: [Responsavel]/[aaaaMMdd-hhMM]/[BACK,FRONT,OTHER]/spike/[Título-Spike]
#### Padrão de Commit:
- se "funcionalidade": feature/[Descrição commit]
- se "bug": bug/[Descrição commit]
- se "spike": spike/[Descrição commit]

#### Outros Padrões:
- se atualização no projeto: [Responsavel]/[aaaaMMdd-hhMM]/[BACK,FRONT,OTHER]/UPDATE-[Descrição-update]
- se criação no projeto: [Responsavel]/[aaaaMMdd-hhMM]/[BACK,FRONT,OTHER]/CREATE-[Descrição-create]
- se exclusão no projeto: [Responsavel]/[aaaaMMdd-hhMM]/[BACK,FRONT,OTHER]/DELETE-[Descrição-create]

- para pequenas atualizações: [Responsavel]/[BACK,FRONT,OTHER]/UPDATE-[Descrição-update]
- para pequenas criações: [Responsavel]/[BACK,FRONT,OTHER]/CREATE-[Descrição-create]
- para pequenas exclusões: [Responsavel]/[BACK,FRONT,OTHER]/DELETE-[Descrição-create]

<span style="color:orange">**NOTA**</span>
- Desenvolvimento deve ser feito com base na branch home.
- Para desenvolver, crie uma branch de desenvolvimento com base na branch home correspondente a Feature, Bug ou Spike.
- Pull requests devem ser feitos para a branch home. Quando o desenvolvimento estiver concluído, a branch home deve abrir um pull request para a branch de release do projeto.
- Em caso de refatorar durante o projeto, atualize primeiro a documentação Gherkin e os diagramas UML.

![Gitflow](../.assets/gitflow_nova_feature.png)

![Gitflow](../.assets/gitflow_bug.png)


### <span style="color: yellow">🔧 Funcionalidades Antigas</span> - *(quando a solução existe, mas precisa de reparos e ajustes)*

#### 📋 Etapa 1: Análise de Impacto
1. **Tech Lead (Sênior)** - Analisar impacto da mudança na arquitetura existente
2. **QA Lead (Pleno/Sênior)** - Analisar impacto nos testes existentes e cenários afetados

#### 📝 Etapa 2: Atualização da Documentação
3. **QA (Pleno/Sênior)** - Atualizar seção de funcionalidade no README do módulo
4. **DEV (Pleno/Sênior)** - Atualizar diagramas UML afetados pela mudança

#### 🧪 Etapa 3: Atualização de Testes
5. **QA (Júnior/Pleno/Sênior)** - Ajustar automação de testes no módulo
6. **DEV (Júnior/Pleno/Sênior)** - Atualizar testes unitários e de integração

#### 💻 Etapa 4: Implementação
7. **DEV (Júnior/Pleno/Sênior)** - Implementar ajustes na funcionalidade
8. **QA (Pleno/Sênior)** - Executar testes de regressão completos


### <span style="color: aqua">🚀 Processo de Release</span> - *(quando a solução está pronta para implantação)*

#### 📋 Etapa 1: Pré-Release
1. **DEV (Pleno/Sênior)** - Garantir que todas as funcionalidades estejam com DoD completo
2. **QA Lead (Sênior)** - Executar suite completa de testes automatizados
3. **Tech Lead (Sênior)** - Revisar arquitetura e performance
4. **DevOps (Pleno/Sênior)** - Preparar ambiente de staging para testes finais

#### 🔄 Etapa 2: Criação do Release
5. **DEV (Pleno/Sênior)** - Realizar merge da branch home via pull request
6. **DEV (Pleno/Sênior)** - Criar **branch de release**: `release/rXX.XX.XXX`
   - `rXX.XX.XXX` representa a versão do release (ex.: `r01.00.000`)
7. **DevOps (Pleno/Sênior)** - Executar pipeline de build e testes automatizados

#### 🧪 Etapa 3: Validação Final
8. **QA (Pleno/Sênior)** - Executar testes de regressão completos no staging
9. **QA (Júnior/Pleno/Sênior)** - Executar testes de aceitação com scenarios reais
10. **Product Owner** - Validar funcionalidades em ambiente de staging

#### 🏷️ Etapa 4: Tagging e Deploy
11. **DEV (Pleno/Sênior)** - Criar tag de versão: `version/vXX.XX.XXX`
12. **DevOps (Sênior)** - Deploy automatizado para produção
13. **Tech Lead (Sênior)** - Verificar health checks pós-deploy

#### 📊 Etapa 5: Monitoramento Pós-Release
14. **DevOps (Pleno/Sênior)** - Monitorar métricas de sistema (CPU, memória, resposta)
15. **QA (Júnior/Pleno/Sênior)** - Executar smoke tests em produção
16. **Product Owner** - Comunicar release para stakeholders
17. **Toda equipe** - Monitoramento ativo por 24h para identificar problemas

#### 🔄 Etapa 6: Rollback (se necessário)
18. **Tech Lead (Sênior)** - Decisão de rollback baseada em métricas e bugs críticos
19. **DevOps (Sênior)** - Executar procedimento de rollback automatizado
20. **QA (Pleno/Sênior)** - Validar sistema após rollback

#### Diretrizes de Versão:
- **Versão 'Major' (XX.00.000):** Mudanças significativas, novas funcionalidades ou alterações que quebram compatibilidade.
- **Versão 'Minor' (00.XX.000):** Novas funcionalidades ou melhorias sem quebrar compatibilidade.
- **Versão 'Patch' (00.00.XXX):** Correções de 'bugs' ou ajustes menores.

#### Exemplo:
- Branch de Release: `r01.02.003`
- Tag de Versão: `v01.02.003`

<span style="color:orange">**NOTA**</span>
- Certifique-se de que toda a documentação (README, Gherkin, diagramas UML) esteja atualizada antes de criar a branch de release.
- Comunique o release a todas as partes interessadas após a implantação.

## 🔧 Ferramentas e Automação

### 🔨 Stack de Desenvolvimento
- **Linguagem:** Java 21
- **Framework:** Spring Boot
- **Build:** Maven 3.9.6
- **Containers:** Docker & Docker Compose
- **CI/CD:** GitHub Actions
- **Qualidade:** SonarQube, Jacoco (cobertura de testes)

### 🤖 Automação de Pipelines
- **Build automatizado** no push/PR para branches principais
- **Testes automatizados** (unitários, integração, aceitação)
- **Análise de qualidade** com métricas automáticas
- **Deploy automatizado** para staging e produção
- **Notificações** em Slack/Teams para builds falhos

### 📋 Ferramentas de Qualidade
- **Testes unitários:** JUnit 5, Mockito
- **Testes de integração:** TestContainers
- **Testes BDD:** Cucumber
- **Cobertura mínima:** 80% para novos códigos
- **Análise estática:** SpotBugs, PMD, Checkstyle

## 📊 Processo de QA

### 🎯 Estratégia de Testes
1. **Pirâmide de Testes:**
   - 70% Testes Unitários
   - 20% Testes de Integração  
   - 10% Testes E2E/UI

2. **Tipos de Teste por Funcionalidade:**
   - **Testes de Fumaça** - Cenários críticos principais
   - **Testes de Regressão** - Suite completa automatizada
   - **Testes de Performance** - Carga, stress e volume
   - **Testes de Segurança** - Vulnerabilidades e penetração

### 🔍 Processo de Revisão de Código
1. **Checklist obrigatório:**
   - [ ] Código segue padrões de estilo definidos
   - [ ] Testes cobrem cenários principais e edge cases
   - [ ] Documentação atualizada (JavaDoc, README)
   - [ ] Não há código duplicado ou dívida técnica
   - [ ] Performance e segurança consideradas
   - [ ] Logs adequados para debug e monitoramento

2. **Aprovação:**
   - **Mínimo:** 1 aprovação de dev Pleno/Sênior
   - **Ideal:** 2 aprovações para mudanças críticas
   - **Obrigatório:** Aprovação de Tech Lead para mudanças arquiteturais

### 🐛 Processo de Bug Fixing
1. **Priorização:**
   - **P0 (Crítico):** Sistema fora do ar - Fix imediato
   - **P1 (Alto):** Funcionalidade principal quebrada - Fix em 24h
   - **P2 (Médio):** Funcionalidade secundária afetada - Fix em sprint
   - **P3 (Baixo):** Melhorias e ajustes menores - Backlog

2. **Workflow:**
   - Reprodução do bug em ambiente local
   - Criação de teste que falha (reproduz o bug)
   - Implementação do fix
   - Validação que o teste agora passa
   - Testes de regressão para garantir que nada quebrou

## 📝 Templates e Checklists

### 📄 Template de User Story
```markdown
## 📋 [ID] - Título da User Story

### 👤 Como
[Tipo de usuário]

### 🎯 Eu quero
[Funcionalidade desejada]

### 💡 Para que
[Valor/benefício esperado]

### ✅ Critérios de Aceitação
- [ ] Critério 1
- [ ] Critério 2
- [ ] Critério 3

### 🧪 Cenários de Teste
**Cenário 1:** Caminho feliz
- Dado que...
- Quando...
- Então...

**Cenário 2:** Validação de erro
- Dado que...
- Quando...
- Então...

### 📐 Critérios Técnicos
- [ ] Performance: Tempo de resposta < 200ms
- [ ] Segurança: Validação de entrada
- [ ] Acessibilidade: WCAG 2.1 AA
- [ ] Compatibilidade: Chrome, Firefox, Safari
```

### 🔄 Template de Pull Request
```markdown
## 📋 Descrição
[Descrição clara do que foi implementado]

## 🔗 Issue/User Story
Closes #[número da issue]

## 🧪 Tipo de Mudança
- [ ] Bug fix (mudança que corrige um problema)
- [ ] Nova funcionalidade (mudança que adiciona funcionalidade)
- [ ] Breaking change (mudança que quebra compatibilidade)
- [ ] Refatoração (mudança que não afeta comportamento)
- [ ] Documentação (apenas mudanças na documentação)

## ✅ Checklist
- [ ] Testes unitários passando
- [ ] Testes de integração passando
- [ ] Documentação atualizada
- [ ] Code review realizado
- [ ] Pipeline verde
- [ ] Testado em ambiente local

## 🧪 Como Testar
1. [Passo 1]
2. [Passo 2]
3. [Resultado esperado]

## 📸 Screenshots (se aplicável)
[Adicionar screenshots da funcionalidade]
```

### ✅ Checklist de Release
```markdown
## 🚀 Checklist de Release v[X.Y.Z]

### 📋 Pré-Release
- [ ] Todas as user stories da sprint foram concluídas
- [ ] Todos os bugs críticos foram corrigidos
- [ ] Testes automatizados passando (95%+ success rate)
- [ ] Code coverage > 80%
- [ ] Análise de segurança realizada
- [ ] Performance testada e aprovada
- [ ] Documentação atualizada

### 🔄 Durante Release
- [ ] Branch de release criada
- [ ] Tag de versão aplicada
- [ ] Deploy em staging realizado
- [ ] Testes de fumaça em staging passando
- [ ] Deploy em produção realizado
- [ ] Health checks validados
- [ ] Smoke tests em produção passando

### 📊 Pós-Release
- [ ] Métricas de monitoramento normais
- [ ] Logs sem erros críticos
- [ ] Feedback de usuários coletado
- [ ] Comunicação para stakeholders enviada
- [ ] Retrospectiva de release agendada
```

## 📈 Métricas e Monitoramento

### 📊 KPIs de Desenvolvimento
- **Velocity:** Story points entregues por sprint
- **Lead Time:** Tempo entre início e entrega de uma funcionalidade
- **Cycle Time:** Tempo de desenvolvimento efetivo
- **Code Coverage:** Percentual de código coberto por testes (meta: >80%)
- **Technical Debt:** Tempo estimado para corrigir problemas identificados

### 🔍 Métricas de Qualidade
- **Bug Rate:** Bugs encontrados por funcionalidade entregue
- **Defect Escape Rate:** Bugs que chegaram à produção
- **Test Automation Rate:** Percentual de testes automatizados
- **Code Review Coverage:** Percentual de código revisado
- **First Time Right:** Percentual de deploys sem rollback

### 🚀 Métricas de Performance
- **Build Time:** Tempo de execução do pipeline de CI/CD
- **Deployment Frequency:** Frequência de deploys em produção
- **Mean Time to Recovery (MTTR):** Tempo médio para corrigir problemas
- **Change Failure Rate:** Percentual de deploys que causaram problemas

### 📱 Monitoramento de Sistema
- **Application Performance Monitoring (APM):** New Relic/Datadog
- **Log Management:** ELK Stack (Elasticsearch, Logstash, Kibana)
- **Infrastructure Monitoring:** Prometheus + Grafana
- **Alerting:** PagerDuty/OpsGenie para incidentes críticos

### 📊 Dashboard de Métricas
- **Business Metrics:** Usuários ativos, conversão, revenue
- **Technical Metrics:** Response time, throughput, error rate
- **Team Metrics:** Velocity, burndown, code quality
- **Operational Metrics:** Uptime, deployment success rate

</details>

<br>

---

# 🧪 Pacote de Qualidade

> 📋 **Objetivo:** Documentar e organizar todos os testes automatizados, cenários BDD e validações de qualidade do projeto.

<details>
  <summary>🛠 Visualizar Pacote Completo</summary>

## 📚 Estrutura do Pacote de Qualidade

### 🎯 Propósito
- **Testes de Aceitação:** Automação BDD com Cucumber
- **Validação de Cenários:** Gherkin para cada funcionalidade
- **Rastreabilidade:** Ligação entre requisitos e testes
- **Documentação Viva:** Especificações executáveis

### 🏗️ Organização por Módulos

```
📁 Pacote de Qualidade/
├── 📂 core/                    # Testes do módulo core
├── 📂 ms_user/                 # Testes do microserviço de usuários
├── 📂 ms_quiz/                 # Testes do microserviço de quiz
├── 📂 ms_live/                 # Testes do microserviço de lives
├── 📂 ms_mono/                 # Testes do microserviço monolítico
├── 📂 ms_auth/                 # Testes do microserviço de autenticação
└── 📂 integration/             # Testes de integração entre módulos
```

---

## 🔧 core/ - *Módulo Base*

👨‍💻 **Responsabilidade:** Testes de aceitação para componentes base do sistema. Automação BDD para funcionalidades core.

<details>
    <summary>🛠 Detalhes do Módulo Core</summary>

### 📊 Status Geral do Módulo
- **Features Totais:** 1
- **Features Concluídas:** 0  
- **Features em Desenvolvimento:** 1
- **Cobertura de Testes:** 85%

### 🎯 Features Implementadas

<details>
  <summary>🛠 F0000001/Global_exception - 🔄 Em Desenvolvimento</summary>

#### 📊 Status da Feature
- 🔵 **Status:** Em Desenvolvimento
- 👤 **Responsável QA:** [Nome do QA]
- 📅 **Data Início:** [Data]
- 🎯 **Sprint:** [Sprint Atual]
- ⏱️ **Estimativa:** [X] horas

#### 📋 Informações da Feature

**📝 Descrição Resumida:**
Sistema de exceções globais para padronizar tratamento de erros em todo o projeto.

**🎯 Objetivo de Negócio:**
Centralizar o tratamento de erros para melhorar debugging e experiência do usuário.

**👥 Stakeholders:**
- Desenvolvedores (facilita debugging)
- Suporte (mensagens padronizadas)
- Usuários finais (feedback claro de erros)

#### 📋 Especificação Técnica

**🔧 Componentes a Serem Testados:**
- Classe `GlobalException` no pacote `com.pi.utils.exceptions`
- Enum `ErrorCatalogEnum` no pacote `com.pi.utils.enums`

**📐 Critérios de Aceitação:**
- [ ] Exceção contém todos os campos obrigatórios (code, message, causes, action, trace)
- [ ] Código de erro segue padrão 'C_GB_XXXXX'
- [ ] Método `toJson()` retorna formato JSON válido
- [ ] Método `toString()` retorna formato legível
- [ ] Integração com `ErrorCatalogEnum` funciona corretamente

**🧪 Cenários de Teste Principais:**
1. **Criação de exceção** - Com todos os campos preenchidos
2. **Serialização JSON** - Conversão para formato JSON
3. **Serialização String** - Conversão para formato texto
4. **Integração com enum** - Uso do catálogo de erros
5. **Tratamento em camadas** - Captura em níveis superiores

#### 🥒 Especificação Gherkin

```gherkin
Feature: F0000001/Global_Exception
  """
  Como desenvolvedor do sistema
  Eu quero uma exceção global padronizada
  Para que eu possa tratar erros de forma consistente em toda a aplicação
  
  Regras de Negócio:
  - Toda exceção deve ter código único no padrão C_GB_XXXXX
  - Mensagens devem ser claras para desenvolvedores e logs
  - Campos obrigatórios: code, message, causes, action, trace
  - Suporte a serialização JSON para APIs
  - Integração com catálogo de erros centralizado
  """

  Background:
    Given que o sistema de exceções globais está configurado
    And o catálogo de erros está disponível

  @smoke @critical
  Scenario: Criação de exceção com todos os campos
    Given que preciso lançar uma exceção do tipo "SISTEMA_INDISPONIVEL"
    When eu crio uma GlobalException com o código "C_GB_00001"
    Then a exceção deve conter o campo "code" com valor "C_GB_00001"
    And a exceção deve conter o campo "message" preenchido
    And a exceção deve conter o campo "causes" preenchido
    And a exceção deve conter o campo "action" preenchido
    And o campo "trace" deve estar disponível

  @json @api
  Scenario: Serialização para JSON
    Given que tenho uma GlobalException criada
    When eu chamo o método "toJson()"
    Then deve retornar um JSON válido
    And o JSON deve conter os campos "code", "message", "causes", "action", "trace"
    And o formato deve estar correto para resposta de API

  @logging @debug
  Scenario: Serialização para String
    Given que tenho uma GlobalException criada
    When eu chamo o método "toString()"
    Then deve retornar uma string formatada
    And deve ser legível para logs
    And deve conter todos os campos principais

  @integration @enum
  Scenario Outline: Integração com catálogo de erros
    Given que existe um erro catalogado com código "<codigo>"
    When eu crio uma GlobalException usando o ErrorCatalogEnum
    Then a exceção deve ser criada automaticamente
    And deve conter a mensagem padrão do catálogo
    And deve ter as ações recomendadas preenchidas

    Examples:
      | codigo     | tipo_erro           |
      | C_GB_00001 | SISTEMA_INDISPONIVEL|
      | C_GB_00002 | DADOS_INVALIDOS     |
      | C_GB_00003 | ACESSO_NEGADO       |

  @error_handling @layers
  Scenario: Captura em diferentes camadas
    Given que uma exceção é lançada na camada de serviço
    When a exceção é propagada para o controller
    Then ela deve manter todas as informações originais
    And deve ser possível adicionar contexto adicional
    And o trace deve ser preservado
```

#### 🔬 Cenários de Teste Detalhados

**🧪 Testes Unitários Relacionados:**
- `GlobalExceptionTest.java` - Testes da classe principal
- `ErrorCatalogEnumTest.java` - Testes do enum de catálogo
- `ExceptionSerializationTest.java` - Testes de serialização

**🔗 Testes de Integração:**
- `GlobalExceptionIntegrationTest.java` - Integração com outros componentes
- `ErrorHandlingE2ETest.java` - Fluxo completo de tratamento de erros

**📊 Métricas de Qualidade:**
- **Cobertura de Código:** 90% (meta)
- **Cenários BDD:** 5 implementados
- **Casos de Teste:** 15 total
- **Tempo de Execução:** < 2s (todos os testes)

#### 🔄 Histórico de Alterações

| Data | Versão | Alteração | Responsável |
|------|--------|-----------|-------------|
| 2024-01-15 | 0.1 | Criação inicial da especificação | QA Lead |
| 2024-01-16 | 0.2 | Adição de cenários de integração | QA Júnior |

</details><br>

### 📊 Métricas do Módulo Core

| Métrica | Valor Atual | Meta | Status |
|---------|-------------|------|--------|
| **Cobertura de Testes** | 85% | 80% | ✅ |
| **Scenarios BDD** | 5 | 8 | 🔄 |
| **Tempo Execução** | 1.8s | < 3s | ✅ |
| **Taxa de Sucesso** | 95% | 98% | 🔄 |

### 📈 Versioning

| Versão | Data | Descrição | Features |
|:-------|:-----|:----------|:---------|
| `00.01` | 2024-01-15 | Versão inicial | F0000001 |
| `00.02` | - | Próxima versão | F0000002, F0000003 |

</details><br>

---

## 📝 Template para Novas Features de QA

```markdown
<details>
  <summary>🛠 F[NUMERO]/[Nome_da_Feature] - [Status]</summary>

#### 📊 Status da Feature
- 🔵 **Status:** [Em Desenvolvimento/Parado/Concluído]
- 👤 **Responsável QA:** [Nome do QA]
- 📅 **Data Início:** [Data]
- 🎯 **Sprint:** [Sprint Atual]
- ⏱️ **Estimativa:** [X] horas

#### 📋 Informações da Feature

**📝 Descrição Resumida:**
[Breve descrição da funcionalidade]

**🎯 Objetivo de Negócio:**
[Por que esta feature é importante]

**👥 Stakeholders:**
- [Lista de stakeholders e como são impactados]

#### 📋 Especificação Técnica

**🔧 Componentes a Serem Testados:**
- [Lista de classes, métodos, endpoints a testar]

**📐 Critérios de Aceitação:**
- [ ] [Critério 1]
- [ ] [Critério 2]
- [ ] [Critério 3]

**🧪 Cenários de Teste Principais:**
1. **[Nome Cenário 1]** - [Descrição]
2. **[Nome Cenário 2]** - [Descrição]

#### 🥒 Especificação Gherkin

```gherkin
Feature: F[NUMERO]/[Nome_da_Feature]
  """
  Como [tipo de usuário]
  Eu quero [funcionalidade]
  Para que [benefício/valor]
  
  Regras de Negócio:
  - [Regra 1]
  - [Regra 2]
  """

  Background:
    Given [pré-condições comuns]

  @smoke @critical
  Scenario: [Nome do cenário principal]
    Given [pré-condição]
    When [ação]
    Then [resultado esperado]
    And [validação adicional]

  @[tag] @[categoria]
  Scenario Outline: [Nome do cenário com exemplos]
    Given [pré-condição com "<parametro>"]
    When [ação com "<parametro>"]
    Then [resultado com "<parametro>"]

    Examples:
      | parametro | valor_esperado |
      | valor1    | resultado1     |
      | valor2    | resultado2     |
```

#### 🔬 Cenários de Teste Detalhados

**🧪 Testes Unitários Relacionados:**
- [Lista de classes de teste]

**🔗 Testes de Integração:**
- [Lista de testes de integração]

**📊 Métricas de Qualidade:**
- **Cobertura de Código:** [%] (meta: 80%)
- **Cenários BDD:** [numero] implementados
- **Casos de Teste:** [numero] total
- **Tempo de Execução:** [tempo] (meta: < 5s)

#### 🔄 Histórico de Alterações

| Data | Versão | Alteração | Responsável |
|------|--------|-----------|-------------|
| [Data] | [Ver] | [Descrição] | [Nome] |

</details><br>
```

</details>

# 💻 Pacote de Desenvolvedor

> 📋 **Objetivo:** Documentar arquitetura, diagramas UML, especificações técnicas e decisões de design para cada módulo do sistema.

<details>
  <summary>🛠 Visualizar Pacote Completo</summary>

## 📚 Estrutura do Pacote de Desenvolvedor

### 🎯 Propósito
- **Documentação Técnica:** Arquitetura e design de cada módulo
- **Diagramas UML:** Visualização de classes, sequências e componentes
- **Especificações:** Detalhes técnicos para implementação
- **Decisões de Design:** Justificativas arquiteturais e padrões

### 🏗️ Organização por Módulos

```
📁 Pacote de Desenvolvedor/
├── 📂 core/                    # Documentação do módulo core
├── 📂 ms_user/                 # Documentação do microserviço de usuários
├── 📂 ms_quiz/                 # Documentação do microserviço de quiz
├── 📂 ms_live/                 # Documentação do microserviço de lives
├── 📂 ms_mono/                 # Documentação do microserviço monolítico
├── 📂 ms_auth/                 # Documentação do microserviço de autenticação
├── 📂 architecture/            # Documentação arquitetural geral
└── 📂 shared/                  # Componentes compartilhados
```

---

## 🔧 core/ - *Módulo Base*

👨‍💻 **Responsabilidade:** Base de códigos comuns do sistema. Toda lógica de negócio fundamental e componentes compartilhados são implementados aqui.

<details>
    <summary>🛠 Detalhes do Módulo Core</summary>

### 📊 Status Geral do Módulo
- **Features Totais:** 1
- **Features Concluídas:** 0  
- **Features em Desenvolvimento:** 1
- **Cobertura de Documentação:** 85%
- **Complexidade Ciclomática:** Baixa (< 10)

### 🎯 Features Implementadas

<details>
  <summary>🛠 F0000001/Global_exception - 🔄 Em Desenvolvimento</summary>

#### 📊 Status da Feature
- 🔵 **Status:** Em Desenvolvimento
- 👤 **Responsável DEV:** [Nome do Desenvolvedor]
- 🏗️ **Arquiteto:** [Nome do Arquiteto]
- 📅 **Data Início:** [Data]
- 🎯 **Sprint:** [Sprint Atual]
- ⏱️ **Estimativa:** [X] horas

#### 📋 Informações da Feature

**📝 Descrição Técnica:**
Sistema centralizado de exceções globais utilizando padrão Strategy com enum para catálogo de erros. Implementa serialização JSON e toString customizados para logs e APIs.

**🎯 Objetivo Arquitetural:**
Padronizar tratamento de exceções em toda aplicação, reduzir código duplicado e melhorar debugging/monitoramento.

**🏗️ Decisões de Design:**
- **Padrão Strategy:** Para diferentes tipos de erro
- **Enum Catalog:** Centralização de códigos e mensagens
- **Serialização Customizada:** Para diferentes contextos (API/Log)
- **Immutable Object:** Para garantir consistência

#### 📐 Especificações Técnicas

**🔧 Componentes Implementados:**
- `GlobalException.java` - Classe principal de exceção
- `ErrorCatalogEnum.java` - Catálogo de códigos de erro
- `ExceptionSerializer.java` - Utilitário de serialização
- `ErrorContext.java` - Contexto adicional para debugging

**📦 Estrutura de Pacotes:**
```
com.pi.utils.exceptions/
├── GlobalException.java
├── ErrorContext.java
└── serializers/
    └── ExceptionSerializer.java

com.pi.utils.enums/
└── ErrorCatalogEnum.java
```

**🔗 Dependências:**
- `com.fasterxml.jackson` - Para serialização JSON
- `org.slf4j` - Para logging integrado
- `org.springframework.http` - Para códigos HTTP

**⚙️ Configurações:**
- **Padrão de Códigos:** `C_GB_XXXXX` (Core_Global_Numero)
- **Serialização:** JSON compacto para APIs, formato estendido para logs
- **Log Level:** ERROR para exceções críticas, WARN para validações

#### 🎨 Diagramas Arquiteturais

**📊 Diagrama de Classes:**
![Diagrama de Classes](../.assets/core/dc_F0000001_global_exception.png)

**🔄 Diagrama de Sequência - Criação de Exceção:**
```mermaid
sequenceDiagram
    participant S as Service
    participant GE as GlobalException
    participant EC as ErrorCatalogEnum
    participant L as Logger

    S->>EC: getError(errorCode)
    EC-->>S: ErrorInfo
    S->>GE: new GlobalException(errorInfo)
    GE->>GE: populateFields()
    GE->>L: logException()
    GE-->>S: exception instance
```

**🏗️ Diagrama de Componentes:**
```mermaid
graph TB
    subgraph "Core Module"
        GE[GlobalException]
        EC[ErrorCatalogEnum]
        ES[ExceptionSerializer]
        CT[ErrorContext]
    end
    
    subgraph "External"
        API[REST Controllers]
        SRV[Business Services]
        LOG[Logging System]
    end
    
    SRV --> GE
    GE --> EC
    GE --> ES
    GE --> CT
    API --> GE
    GE --> LOG
```

#### 💾 Especificação de Classes

**🔧 GlobalException.java**
```java
/**
 * Exceção global padronizada para todo o sistema
 * @author [Nome do Desenvolvedor]
 * @version 1.0
 * @since 2024-01-15
 */
public class GlobalException extends RuntimeException {
    private final String code;
    private final String message;
    private final String causes;
    private final String action;
    private final String trace;
    private final ErrorContext context;
    
    // Construtores, getters e métodos de serialização
}
```

**📋 Atributos:**
- `code: String` - Código único do erro (C_GB_XXXXX)
- `message: String` - Mensagem descritiva do erro
- `causes: String` - Possíveis causas do problema
- `action: String` - Ações recomendadas para resolução
- `trace: String` - Stack trace adicional
- `context: ErrorContext` - Contexto adicional (usuário, request, etc.)

**🔧 Métodos Principais:**
- `toJson(): String` - Serialização para APIs REST
- `toString(): String` - Formato para logs humanos
- `getHttpStatus(): HttpStatus` - Status HTTP correspondente
- `addContext(key, value): void` - Adicionar contexto dinâmico

**🔧 ErrorCatalogEnum.java**
```java
/**
 * Catálogo centralizado de códigos de erro
 */
public enum ErrorCatalogEnum {
    SYSTEM_UNAVAILABLE("C_GB_00001", "Sistema temporariamente indisponível", 
                      "Sobrecarga ou manutenção", "Tente novamente em alguns minutos"),
    INVALID_DATA("C_GB_00002", "Dados de entrada inválidos", 
                "Validação falhou", "Verifique os dados e tente novamente"),
    ACCESS_DENIED("C_GB_00003", "Acesso negado", 
                 "Permissões insuficientes", "Contacte o administrador");
    
    // Implementação do enum
}
```

#### 🧪 Casos de Uso

**1. Uso em Controller:**
```java
@RestController
public class UserController {
    
    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody UserDto user) {
        try {
            return ResponseEntity.ok(userService.create(user));
        } catch (GlobalException e) {
            return ResponseEntity
                .status(e.getHttpStatus())
                .body(e.toJson());
        }
    }
}
```

**2. Uso em Service:**
```java
@Service
public class UserService {
    
    public User create(UserDto dto) {
        if (dto.getEmail() == null) {
            throw new GlobalException(ErrorCatalogEnum.INVALID_DATA)
                .addContext("field", "email")
                .addContext("action", "create_user");
        }
        // lógica de criação
    }
}
```

**3. Tratamento Global:**
```java
@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<String> handleGlobalException(GlobalException e) {
        logger.error("Global exception occurred: {}", e.toString());
        return ResponseEntity
            .status(e.getHttpStatus())
            .body(e.toJson());
    }
}
```

#### 📊 Métricas de Qualidade

**🔍 Análise Estática:**
- **Complexidade Ciclomática:** 3 (Simples)
- **Linhas de Código:** 150 (Método principal)
- **Acoplamento:** Baixo (2 dependências externas)
- **Coesão:** Alta (responsabilidade única)

**🧪 Cobertura de Testes:**
- **Testes Unitários:** 95%
- **Testes de Integração:** 85%
- **Mutação Testing:** 88%

**⚡ Performance:**
- **Criação de Exceção:** < 1ms
- **Serialização JSON:** < 0.5ms
- **Logging:** < 2ms (total)

#### 🔄 Histórico de Alterações

| Data | Versão | Alteração | Arquiteto/Dev |
|------|--------|-----------|---------------|
| 2024-01-15 | 0.1 | Design inicial e especificação | Arquiteto Lead |
| 2024-01-16 | 0.2 | Implementação da classe base | Dev Sênior |
| 2024-01-17 | 0.3 | Adição de contexto dinâmico | Dev Sênior |

#### 🔮 Próximos Passos
- [ ] Implementar métricas automáticas de erros
- [ ] Adicionar suporte a internacionalização
- [ ] Integrar com sistema de alertas
- [ ] Criar dashboard de monitoramento de erros

</details><br>

### 📊 Métricas do Módulo Core

| Métrica | Valor Atual | Meta | Status |
|---------|-------------|------|--------|
| **Cobertura de Documentação** | 85% | 80% | ✅ |
| **Diagramas Atualizados** | 3/4 | 100% | 🔄 |
| **Complexidade Média** | 6 | < 10 | ✅ |
| **Technical Debt** | 2h | < 8h | ✅ |

### 🏗️ Arquitetura do Módulo

**🎯 Padrões Utilizados:**
- **Strategy Pattern** - Para diferentes tipos de erro
- **Factory Pattern** - Para criação de exceções
- **Builder Pattern** - Para contexto adicional
- **Singleton Pattern** - Para catálogo de erros

**📐 Princípios SOLID:**
- ✅ **SRP** - Cada classe tem responsabilidade única
- ✅ **OCP** - Extensível para novos tipos de erro
- ✅ **LSP** - Substitution principle respeitado
- ✅ **ISP** - Interfaces específicas e coesas
- ✅ **DIP** - Dependências invertidas via interfaces

### 📈 Versioning

| Versão | Data | Descrição | Features | Arquiteto |
|:-------|:-----|:----------|:---------|:----------|
| `00.01` | 2024-01-15 | Versão inicial | F0000001 | [Nome] |
| `00.02` | - | Próxima versão | F0000002, F0000003 | [Nome] |

</details><br>

---

## 📝 Template para Novas Features de Desenvolvimento

```markdown
<details>
  <summary>🛠 F[NUMERO]/[Nome_da_Feature] - [Status]</summary>

#### 📊 Status da Feature
- 🔵 **Status:** [Em Desenvolvimento/Parado/Concluído]
- 👤 **Responsável DEV:** [Nome do Desenvolvedor]
- 🏗️ **Arquiteto:** [Nome do Arquiteto]
- 📅 **Data Início:** [Data]
- 🎯 **Sprint:** [Sprint Atual]
- ⏱️ **Estimativa:** [X] horas

#### 📋 Informações da Feature

**📝 Descrição Técnica:**
[Descrição detalhada da implementação técnica]

**🎯 Objetivo Arquitetural:**
[Por que esta solução foi escolhida arquiteturalmente]

**🏗️ Decisões de Design:**
- **Padrão 1:** [Justificativa]
- **Padrão 2:** [Justificativa]
- **Tecnologia X:** [Por que foi escolhida]

#### 📐 Especificações Técnicas

**🔧 Componentes Implementados:**
- [Lista de classes e interfaces]

**📦 Estrutura de Pacotes:**
```
[estrutura de diretórios e arquivos]
```

**🔗 Dependências:**
- [Lista de dependências externas]

**⚙️ Configurações:**
- [Configurações necessárias]

#### 🎨 Diagramas Arquiteturais

**📊 Diagrama de Classes:**
![Diagrama](../assets/[modulo]/dc_F[numero]_[nome].png)

**🔄 Diagrama de Sequência:**
```mermaid
[diagrama mermaid]
```

**🏗️ Diagrama de Componentes:**
```mermaid
[diagrama mermaid]
```

#### 💾 Especificação de Classes

**🔧 [NomeClasse].java**
```java
/**
 * [Descrição da classe]
 * @author [Nome]
 * @version [Versão]
 * @since [Data]
 */
[Assinatura da classe]
```

**📋 Atributos:**
- [Lista de atributos com descrição]

**🔧 Métodos Principais:**
- [Lista de métodos com descrição]

#### 🧪 Casos de Uso

**1. [Cenário 1]:**
```java
[Exemplo de código]
```

**2. [Cenário 2]:**
```java
[Exemplo de código]
```

#### 📊 Métricas de Qualidade

**🔍 Análise Estática:**
- **Complexidade Ciclomática:** [valor]
- **Linhas de Código:** [valor]
- **Acoplamento:** [Alto/Médio/Baixo]
- **Coesão:** [Alta/Média/Baixa]

**🧪 Cobertura de Testes:**
- **Testes Unitários:** [%]
- **Testes de Integração:** [%]

**⚡ Performance:**
- **[Métrica 1]:** [valor]
- **[Métrica 2]:** [valor]

#### 🔄 Histórico de Alterações

| Data | Versão | Alteração | Arquiteto/Dev |
|------|--------|-----------|---------------|
| [Data] | [Ver] | [Descrição] | [Nome] |

#### 🔮 Próximos Passos
- [ ] [Próximo passo 1]
- [ ] [Próximo passo 2]

</details><br>
```

### 🏗️ Template para Documentação de Módulo

```markdown
## 🔧 [nome_modulo]/ - *[Propósito do Módulo]*

👨‍💻 **Responsabilidade:** [Descrição da responsabilidade do módulo]

<details>
    <summary>🛠 Detalhes do Módulo [Nome]</summary>

### 📊 Status Geral do Módulo
- **Features Totais:** [numero]
- **Features Concluídas:** [numero]  
- **Features em Desenvolvimento:** [numero]
- **Cobertura de Documentação:** [%]
- **Complexidade Ciclomática:** [Baixa/Média/Alta]

### 🎯 Features Implementadas
[Lista de features usando o template acima]

### 📊 Métricas do Módulo

| Métrica | Valor Atual | Meta | Status |
|---------|-------------|------|--------|
| **Métrica 1** | [valor] | [meta] | [status] |
| **Métrica 2** | [valor] | [meta] | [status] |

### 🏗️ Arquitetura do Módulo

**🎯 Padrões Utilizados:**
- [Lista de padrões de design]

**📐 Princípios SOLID:**
- [Check de cada princípio]

### 📈 Versioning

| Versão | Data | Descrição | Features | Arquiteto |
|:-------|:-----|:----------|:---------|:----------|
| [ver] | [data] | [desc] | [features] | [nome] |

</details><br>
```

</details>

<br>

---