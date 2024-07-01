import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';


@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule, RouterModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  constructor(private router: Router) {}

  login = {
    email:'',
    senha:''
  }

  entrar(){
    if(this.login.email && this.login.senha) {
      this.router!.navigate(['/home']);
    } else {
      window.alert('Por favor, preencha os campos');
    }
  }
  recuperar(){
    window.alert("Processo de recuperação de senha enviado para o e-mail cadastrado")
  }

}
