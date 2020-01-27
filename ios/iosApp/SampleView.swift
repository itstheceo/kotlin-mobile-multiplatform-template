import core
import SwiftUI

struct SampleView: View {
	
	var body: some View {
		Text(SampleKt.hello())
	}
}

#if DEBUG
struct SampleView_Previews: PreviewProvider {

	static var previews: some View {
		SampleView()
	}
}
#endif
