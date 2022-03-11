<template>
    <div>
        <div id="header"> 
            <router-link :to="{ name: 'Home' }"
                    class="nav-link"
                    active-class="active">
                Home
            </router-link>
            <router-link :to="{ name: 'Test' }"
                    class="nav-link"
                    active-class="active">     
                Test            
            </router-link>
        
        </div>

        <h2>복습페이지 1</h2>

        <div id="app">
            <p> {{msg}} </p>

            <global-component>

            </global-component>

            <local-component> </local-component>
        </div>
    

    </div>

</template>