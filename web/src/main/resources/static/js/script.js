fetch('../movie')
    .then(res => res.json())
    .then(res => {
        const invoiceListNode = document.getElementById('movie-list');
        invoiceListNode.innerHTML = "";

        const table = document.createElement("table");
        table.setAttribute("border","1");
        invoiceListNode.appendChild(table);

        res.forEach(movie => {

            const tr = document.createElement("tr");
            table.appendChild(tr);

            let td = document.createElement("td");
            let text = document.createTextNode(`${movie.title}`);
            td.appendChild(text);
            tr.appendChild(td);

            td = document.createElement("td");
            text = document.createTextNode(`${movie.genre}`);
            td.appendChild(text);
            tr.appendChild(td);

            td = document.createElement("td");
            const button = document.createElement("button");
            button.setAttribute("type","button");
            button.onclick = function() {
                showDetail(`${movie.id}`);
            };
            text = document.createTextNode("Details");
            button.appendChild(text);
            td.appendChild(button);
            tr.appendChild(td);


        });

    });


function showDetail(id){
    fetch("../movie/"+id)
    .then(res => res.json())
    .then(res => {
        const invoiceDetailNode = document.getElementById('movie-detail');
        invoiceDetailNode.innerHTML = "";

        let p = document.createElement("p");
        let text = document.createTextNode(`Titre: ${res.title}`);
        p.appendChild(text);
        invoiceDetailNode.appendChild(p);

        p = document.createElement("p");
        text = document.createTextNode(`Genre: ${res.genre}`);
        p.appendChild(text);
        invoiceDetailNode.appendChild(p);

        p = document.createElement("p");
        text = document.createTextNode(`Description: ${res.description}`);
        p.appendChild(text);
        invoiceDetailNode.appendChild(p);

    });
}
