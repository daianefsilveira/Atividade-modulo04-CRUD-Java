/**
 * Validar campos obrigatorios
 */

function validar(){
	let nome = frmCadastro.nome.value
	let cpf = frmCadastro.cpf.value
	if (nome === "") {
		alert('Preencha o campo Nome')
		frmCadastro.nome.focus()
		return false
	} else if (cpf === "") {
		alert('Preencha o campo CPF')
		frmCadastro.cpf.focus()
		return false
	} else {
		document.forms["frmCadastro"].submit()
	}
}

function validar2(){
	let origem = frmPassagem.origem.value
	let destino = frmPassagem.destino.value
	
	if(origem === "") {
		alert('Preencha o campo origem')
		frmPassagem.origem.focus()
		return false
	} else if (destino === "") {
		alert('Preencha o campo destino')
		frmPassagem.destino.focus()
		return false
	} else {
		document.forms["frmPassagem"].submit()
	}
}
