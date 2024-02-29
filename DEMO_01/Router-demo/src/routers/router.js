import {createRouter,createWebHashHistory} from 'vue-router'
import Home from '../components/Home.vue'
import List from '../components/List.vue'
import Update from '../components/Update.vue'

const router = createRouter({

    history:createWebHashHistory(),

    routes:[
        {
            path:'/home',
            component:Home
        },
        {
            path:'/list',
            component:List
        },
        {
            path:'/update',
            component:Update
        },
        {
            path:'/',
            component:Home
        }
    ]
})

export {
    router
}