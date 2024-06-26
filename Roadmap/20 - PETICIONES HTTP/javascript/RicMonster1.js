//EJERCICIO

function getAbradolfLincler() {
	let url = 'https://rickandmortyapi.com/api/character/7';
	fetch(url)
		.then((response) => response.json())
		.then((data) => {
			console.log(data);
		})
		.catch((error) => console.log(error));
}

//EXTRA
async function getPokeData(id) {
	let baseUrl = 'https://pokeapi.co/api/v2/pokemon/';
	let speciesUrl;
	let chainUrl;

	try {
		await fetch(`${baseUrl}/${id.toLowerCase()}`)
			.then((response) => response.json())
			.then((data) => {
				console.log(`\nName: ${data.name}`);
				console.log(`Id: ${data.id}`);
				console.log(`Weight: ${data.weight}`);
				console.log(`Height: ${data.height}`);
				console.log(`Type: ${data.types.map((type) => type.type.name)}`);
				console.log('Games: ');
				data.game_indices
					.map((game) => game.version.name)
					.forEach((element) => {
						console.log(`* ${element}`);
					});
				speciesUrl = data.species.url;
			});

		await fetch(speciesUrl)
			.then((response) => response.json())
			.then((data) => {
				chainUrl = data.evolution_chain.url;
			});

		await fetch(chainUrl)
			.then((response) => response.json())
			.then((data) => {
				let evolves = data.chain.evolves_to.map((name) => name.species.name);
				console.log(`Evolves to: ${evolves}`);
			});
	} catch (err) {
		console.log(`\nHa ocurrido un error: ${err}`);
	}
}

function requestPokemon() {
	const readline = require('readline');
	const rl = readline.createInterface({
		input: process.stdin,
		output: process.stdout,
	});

	rl.question(
		'\nIngrese la ID o el nombre de su pokemon. Enter para salir\n',
		async (id) => {
			switch (id) {
				case '':
					console.log('Cerrando aplicación...');
					rl.close();
					break;
				default:
					await getPokeData(id);
					requestPokemon();
					break;
			}
		}
	);
}

requestPokemon();

/*
TODO: corregir los bugs al mostrar cadena de evoluciones
*/