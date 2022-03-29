<template>
    <div id="eventbus">
        <h2>Vue EventBus 테스트 페이지</h2>
        <product-name></product-name>
        <product-detail></product-detail>
    </div>
</template>

<script>

import ProductName from '@/components/eventbus/ProductName.vue'
import ProductDetail from '@/components/eventbus/ProductDetail.vue'

export default {
    name: 'EventBusTestPage',
    components: {
        ProductName,
        ProductDetail
    }
}

</script>

<style>

ul {
    list-style-type: none;
    background: #eec3e1;
    padding: 10px;
}
ul li {
    background: #abd1e4;
    margin: 5px;
}

</style>