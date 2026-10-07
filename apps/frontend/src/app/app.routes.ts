import {Routes} from '@angular/router';

export const routes: Routes = [
    {
        path: '',
        loadComponent: () => 
            import('./acceso/acceso.component').then((m) => m.AccessComponent),
    },
];