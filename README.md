# Custom-Mask-for-EditText 🎭 ( Máscara personalizável para EditTexts!)

Uma máscara customizável que pode ser adicionada aos seus EditTexts, e adaptada de acordo com as suas necessidades. Veja como adicionar ao seu projeto:

<br/>

Passo 1: adicione o repósitorio Jitpack no arquivo build.gradle, ao final de repositories:

`allprojects {`
<br>
		<br>`repositories {`
			`...`
		<br>	`maven { url 'https://jitpack.io' }`
		<br>     `}`
	<br>`}`


<br/>

  passo 2: adicione a dependência:

 <br> `dependencies {`
	<br>        `implementation 'com.github.T7Droid:Custom-Mask-for-EditText:1.0.0'`
	<br>`}`

<br/>

  _E pronto, agora você já pode começar a usar!_

<br/>

Adicione um TextChangedListener ao seu EditText, passando como parâmetro um objeto *CustomMask* que invoca o método mask( ), esse método recebe 3 parâmetros: 1° - o modelo da máscara que deseja, o simbolo cerquilha ou hashtag (#) será substituído pelo texto digitado; 2° - seu EditText; o 3° é opcional: você pode passar um TextView que será atualizado conforme o texto é digitado, se não for precisar atualizar nenhum TextView deixe esse parâmetro como `null`. Veja um exemplo de uso de uma máscara usada para telefone:

<br/>

`binding.textInputLayoutPhone.addTextChangedListener(`

`CustomMask.mask(
"(##) #####-####", //Formato da máscara que deseja` 

` binding.textInputLayoutPhone, //Seu editText` 

` binding.myTextView) //TextView a ser atualizado (Opcional)` 

`)`

<br>
Outros exemplos de máscaras que podem ser usadas: 
<br/>CPF: "###.###.###-##"
<br/>CNPJ: "##.###.###/####-##"
<br/>Data: "##-##-####"
<br/>Placa de carro: "###-####"
<br/><br/>

Para remover a máscara use o método unMask(textWithMask: String):
<br/>
<br/>
`CustomMask.unMask(binding.textInputLayoutPhone.text.toString())`
<br/>
</br>
Fique à vontade para criar suas próprias máscaras!
<br/>
<br/>

_Encontrou algum bug? Tem alguma sugestão de melhoria? Fique à vontade para me contatar:_
<br/>
<br/>
Email: [Thyago Neves Silvestre](www.t7droid@gmail.com "T7Droid") _**Desenvolvedor Android**_

[![](https://jitpack.io/v/T7Droid/Custom-Mask-for-EditText.svg)](https://jitpack.io/#T7Droid/Custom-Mask-for-EditText)

