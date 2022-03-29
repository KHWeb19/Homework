<template>
  <div>
    <table border="1">
      <tr>
        <th align="center" width="80">번호</th>
        <th align="center" width="320">제목</th>
        <th align="center" width="100">작성자</th>
        <th align="center" width="100">가격</th>
        <th align="center" width="160">등록일자</th>
      </tr>

      <tr v-if="!products || (Array.isArray(products) && products.length===0)">
        <td colspan="5"> 현재 등록된 게시물 없어요</td>
      </tr>

      <tr v-for="product in products" :key="product.productNo">
        <td>
          {{product.productNo}}
        </td>

        <td>
          <router-link :to="{name: 'ProductReadPage', params: { productNo: product.productNo.toString()}}">
          {{product.title}}
          </router-link>
        </td>

        <td>
          {{product.writer}}
        </td>

        <td>
          {{product.price}}
        </td>

        <td>
          {{product.regDate}}
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: "ProductList",
  props: {
    products: {
      type: Array
    }
  }
}
</script>

<style scoped>

</style>