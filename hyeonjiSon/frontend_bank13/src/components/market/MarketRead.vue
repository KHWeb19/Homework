<template>
    <div>
        <table>
          <tr>
              <td>상품 번호></td>
              <td>
                  <input type="text" :value="market.productNo" readonly/>
              </td>
              <td>상품명</td>
              <td>
                  <input type="text" :value="market.title" readonly/>
              </td>
          </tr>

          <tr>
              <td>판매자</td>
              <td>
                  <input type="text" :value="market.seller" readonly/>
              </td>
          </tr>

          <tr>
              <td>상품 상세보기</td>
              <td>
                  <input type="text" :value="market.content" readonly/>
              </td>
          </tr>
      </table>
    </div>
</template>

<script>
export default {
    name: 'MarketRead',
    props: {
        market: {
            type: Object,
            required: true
        }
    }
}
</script>