import {createRouter,createWebHashHistory} from 'vue-router'
import Home from '../components/Home.vue'
import Goods from '../components/Goods.vue'
import List from '../components/List.vue'
import ReDirect from '../components/ReDirect.vue'
import Update from '../components/Update.vue'

const router = createRouter({
    history:createWebHashHistory(),
    routes:[
        {
            path:'/',
            component:Home
        },
        {
            path:'/home',
            component:Home
        },
        {
            path:'/list',
            component:List
        },
        {
            path:'/goods',
            component:Goods
        },
        {
            path:'/redirect',
            component:ReDirect
        },
        {
            path:'/update',
            component:Update
        },
        {
            path:'/re',
            redirect:Home
        }
        
    ]
})

export {
    router
}