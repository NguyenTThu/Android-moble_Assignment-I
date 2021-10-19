package ui.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@Composable
fun Note() {
    val backgroundShape: Shape = RoundedCornerShape(4.dp)
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .shadow(1.dp)
                .fillMaxWidth()
//                .size(40.dp)
                .background(Color.Green)
            ) {
            TopAppBar(
                title = "JetNotes",
                icon = Icons.Filled.List,
            ) {}
        }
        Divider(color= MaterialTheme.colors.onSurface.copy(alpha=.2f))
        Row(
            modifier = Modifier
                .padding(8.dp)
                .shadow(1.dp, backgroundShape)
                .fillMaxWidth()
                .heightIn(min = 64.dp)
                .background(Color.White, backgroundShape)

        ) {

            NoteColor(
                color = Color.Cyan, size = 40.dp, border = 2.dp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 16.dp, end = 16.dp),

                )


            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = "Title new", maxLines = 1,
                    color = Color.Black,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        letterSpacing = 0.15.sp
                    )
                )
                Text(
                    text = "Content", maxLines = 1,
                    color = Color.Black.copy(alpha = 0.75f),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        letterSpacing = 0.25.sp
                    )
                )
            }
            Checkbox(
                checked = false,
                onCheckedChange = {},
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
        }



        Row(
            modifier = Modifier
                .padding(8.dp)
                .shadow(1.dp, backgroundShape)
                .fillMaxWidth()
                .heightIn(min = 64.dp)
                .background(Color.White, backgroundShape)

        ) {

            NoteColor(
                color = Color.Red, size = 40.dp, border = 2.dp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 16.dp, end = 16.dp),

                )


            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = "Titles", maxLines = 1,
                    color = Color.Black,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        letterSpacing = 0.15.sp
                    )
                )
                Text(
                    text = "Content", maxLines = 1,
                    color = Color.Black.copy(alpha = 0.75f),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        letterSpacing = 0.25.sp
                    )
                )
            }
            Checkbox(
                checked = false,
                onCheckedChange = {},
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
        }



        Row(
            modifier = Modifier
                .padding(8.dp)
                .shadow(1.dp, backgroundShape)
                .fillMaxWidth()
                .heightIn(min = 64.dp)
                .background(Color.White, backgroundShape)

        ) {

            NoteColor(
                color = Color.Yellow, size = 40.dp, border = 2.dp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 16.dp, end = 16.dp),

                )


            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = "Title3", maxLines = 1,
                    color = Color.Black,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        letterSpacing = 0.15.sp
                    )
                )
                Text(
                    text = "Content new", maxLines = 1,
                    color = Color.Black.copy(alpha = 0.75f),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        letterSpacing = 0.25.sp
                    )
                )
            }
            Checkbox(
                checked = false,
                onCheckedChange = {},
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
        }
        Row(
            modifier = Modifier
                .padding(8.dp)
                .shadow(1.dp, backgroundShape)
                .fillMaxWidth()
                .heightIn(min = 64.dp)
                .background(Color.White, backgroundShape)

        ) {

            NoteColor(
                color = Color.Blue, size = 40.dp, border = 2.dp,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 16.dp, end = 16.dp),

                )


            Column(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text ="Làm Việc Nhóm", maxLines = 1,
                    color = Color.Black,
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        letterSpacing = 0.15.sp
                    )
                )
                Text(
                    text = "Chuẩn bị", maxLines = 1,
                    color = Color.Black.copy(alpha = 0.75f),
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        letterSpacing = 0.25.sp
                    )
                )
            }
            Checkbox(
                checked = false,
                onCheckedChange = {},
                modifier = Modifier
                    .padding(start = 8.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun NotePreview() {
    Note()
}
