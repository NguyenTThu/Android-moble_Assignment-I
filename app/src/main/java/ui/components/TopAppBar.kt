package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopAppBar(
    title: String,
    icon: ImageVector,
    onIconClick: () ->Unit,

){
    Row(
//        modifier = Modifier
//            .padding(8.dp)
//            .shadow(1.dp,)
//            .fillMaxWidth()
//            .heightIn(min = 64.dp),


    ) {
        Image(
            imageVector = icon,
            contentDescription ="Screen Navigation Button",
            colorFilter = ColorFilter.tint(Color.White)

        )
        Spacer(Modifier.width(16.dp))

        Text(
            text = title,
//            style = MaterialTheme.typography.body2,
//            modifier = Modifier.fillMaxWidth()
//                        .size(20.dp),
            color = Color.White,
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
//                letterSpacing = 0.25.sp
            )
        )
    }
}




@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar(title = "JetNoste", icon = Icons.Filled.List,onIconClick = {})
}