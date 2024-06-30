import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AlunosComponent } from './alunos/alunos.component';
import { DisciplinasComponent } from './disciplinas/disciplinas.component';
import { LoginComponent } from './login/login.component';
import { CadastroDeAlunoComponent } from './cadastro-de-aluno/cadastro-de-aluno.component';

export const routes: Routes = [

  {
    path:'home',
    component: HomeComponent
  },
  {
    path:'aluno',
    component: AlunosComponent
  },
  {
    path:'disciplina',
    component: DisciplinasComponent
  },
  {
    path:'login',
    component: LoginComponent
  },
  {
    path:'cadastro',
    component: CadastroDeAlunoComponent
  },
];
