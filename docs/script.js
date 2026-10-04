const REPO = "https://github.com/thnck/senai-ads/tree/HEAD/";

const semestres = [
  { t: "Fundamentos", d: "Arquitetura de IoT, levantamento de requisitos, programação e algoritmos, sistemas operacionais." },
  { t: "Web e dados", d: "Backend 1, banco de dados, HTML e CSS, projetos." },
  { t: "Terceiro semestre", d: "Ainda sem projetos publicados.", soon: true },
  { t: "Quarto semestre", d: "Ainda sem projetos publicados.", soon: true },
];

// s: semestre, p: pasta no repositório
const projetos = [
  { t: "Arquitetura de IoT", d: "Atividades sobre dispositivos conectados e sua arquitetura.", s: 1, p: "semestre1/arquitetura-iot" },
  { t: "Levantamento de requisitos", d: "Análise e documentação de requisitos de sistemas.", s: 1, p: "semestre1/levantamento-requisitos" },
  { t: "Programação e algoritmos", d: "Lógica, fluxogramas e exercícios em Java.", s: 1, p: "semestre1/programacao-algoritmos" },
  { t: "Sistemas operacionais", d: "Conteúdos sobre o funcionamento de sistemas operacionais.", s: 1, p: "semestre1/sistemas-operacionais" },
  { t: "Backend 1", d: "Primeiros passos no desenvolvimento backend.", s: 2, p: "semestre2/backend-1" },
  { t: "Banco de dados", d: "Modelagem e consultas.", s: 2, p: "semestre2/data-base" },
  { t: "HTML e CSS", d: "Construção e estilo de páginas web.", s: 2, p: "semestre2/html-css" },
  { t: "Projetos", d: "Projetos integradores da segunda etapa.", s: 2, p: "semestre2/projetos" },
];

document.getElementById("timeline").innerHTML = semestres.map((s, i) => `
  <li data-n="${i + 1}" class="${s.soon ? "soon" : ""}">
    <h3>${s.t}</h3><p>${s.d}</p>
  </li>`).join("");

const chart = document.getElementById("chart");
chart.innerHTML = projetos.map(p => `
  <li data-s="${p.s}">
    <a class="row" href="${REPO}${p.p}" target="_blank" rel="noopener">
      <h3>${p.t}</h3>
      <span class="meta">${p.s}º semestre</span>
      <p>${p.d}</p>
    </a>
  </li>`).join("");

const filters = document.getElementById("filters");
const empty = document.getElementById("empty");
const opcoes = [["Todos", "all"], ...[...new Set(projetos.map(p => p.s))].map(s => [`${s}º semestre`, String(s)])];
filters.innerHTML = opcoes.map(([nome, v], i) => `<button class="chip" type="button" data-v="${v}" aria-pressed="${i === 0}">${nome}</button>`).join("");
filters.addEventListener("click", e => {
  const b = e.target.closest(".chip");
  if (!b) return;
  filters.querySelectorAll(".chip").forEach(x => x.setAttribute("aria-pressed", x === b));
  let shown = 0;
  chart.querySelectorAll("li").forEach(li => {
    const ok = b.dataset.v === "all" || li.dataset.s === b.dataset.v;
    li.hidden = !ok;
    if (ok) shown++;
  });
  empty.hidden = shown > 0;
});

// data da última atualização, direto da API do GitHub (se falhar, o texto padrão permanece)
fetch("https://api.github.com/repos/thnck/senai-ads")
  .then(r => (r.ok ? r.json() : Promise.reject()))
  .then(d => {
    const data = new Date(d.pushed_at).toLocaleDateString("pt-BR", { day: "numeric", month: "long", year: "numeric" });
    document.getElementById("repo-updated").textContent = `Atualizado em ${data}`;
  })
  .catch(() => {});
